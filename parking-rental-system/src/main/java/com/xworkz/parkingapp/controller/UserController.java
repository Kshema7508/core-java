package com.xworkz.parkingapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.parkingapp.constants.ApplicationConstant;
import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;
import com.xworkz.parkingapp.entity.UserParkingEntity;
import com.xworkz.parkingapp.service.UserParkingService;
import com.xworkz.parkingapp.service.UserService;

@Component
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	public UserController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/userSave")
	public String userSave(@Valid UserDTO dto,@Valid UserParkingDTO dtos, BindingResult bindingResult, Model model)throws IOException{
		System.out.println("Running userSave");
		
		if(bindingResult.hasErrors()) {
			System.out.println("Data is Invalid");
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			
			return "/Userinfo.jsp";
		}
		else {
			System.out.println("Data is Valid");
			userService.validateAndSave(dto,dtos);
		
			model.addAttribute("successMsg","User information of "+dto.getUserName()+" saved successfully");
		}
		return "/Responseuser.jsp";
	}
	
	@PostMapping("/sendotp")
	public String sendOTP(String email, Model model, String oneTimePassword,UserEntity entity, String generateOtp, String login, HttpServletRequest req) {
		System.out.println("Running sendOTP method");
		
		System.out.println("Controller: generateOtp "+ generateOtp);
		System.out.println("Controller: login from UI "+ login);
		System.out.println("Controller: email from UI "+ email);
		System.out.println("Controller: otp from UI "+ oneTimePassword);
		
		if(generateOtp != null && "generateOtp".equals(generateOtp)) {
			System.out.println("inside otp");
			//UserDTO dto=userService.userLogin(email,oneTimePassword); 
			UserEntity entity1= userService.findByUserEmail(email);
			
			HttpSession session=req.getSession(true);
			session.setAttribute("emailId", email);
			
			System.out.println(entity1);
			if(entity1 != null) {
				UserEntity ent=userService.userSignIn(email, entity);
				if(ent != null) {
					model.addAttribute("mail", email);
					model.addAttribute("successMsg","OTP send to registered email successfully");
				}
				else {
					model.addAttribute("mail", email);
					model.addAttribute("generateotperror", "Re-generate the OTP");
				}
			}
			else {
				model.addAttribute("mail", email);
				model.addAttribute("emailerror", "Not a registered email");
			}
		}
		else if(login != null && "Login".equals(login)) {
			System.out.println("validating otp...");
			System.out.println("controller: onGenerateOTP(): email from userLogin.jsp: "+email );
			UserDTO isOtpValid=userService.userLogin(email, oneTimePassword);
			UserEntity eneen=userService.findByUserEmail(email);
			System.out.println("eneen: "+eneen);
//			boolean otpNotExpired = eneen.getOtpExpiryTime().isAfter(LocalTime.now());
//			System.out.println("OTP Not Expired "+ otpNotExpired);
			
			if(isOtpValid !=null) {
				HttpSession session=req.getSession(true);
				session.setAttribute("userDto", eneen); 
				
				return "UserLoginSuccess.jsp";
			}
			else {
				model.addAttribute("error","Invalid OTP");
			} 
		}
		return "Usersingin.jsp";		
	}
	
	@PostMapping("/onsave")
	public String onSave(@Valid UserParkingDTO dto, BindingResult bindingResult, Model model, MultipartFile file, HttpServletRequest req) throws IOException {
		System.out.println("Running onSave "+dto);
		
		model.addAttribute("dtos",dto);
		
		if(bindingResult.hasErrors()) {
			System.out.println("Data is invalid");
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			
			return "/UserParkinginfo.jsp";
		}
		else {
			System.out.println("File received: "+file.getName());
			System.out.println("File Size: "+file.getSize());
			System.out.println("File Type: "+file.getContentType());
			System.out.println("File bytes: "+file.getBytes());
			
			dto.setFileName(System.currentTimeMillis()+ "-" +file.getOriginalFilename());
			//dto.setFileName(file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			File physiicalFile = new File(ApplicationConstant.FILE_LOCATION + dto.getFileName());
			
			try (OutputStream os = new FileOutputStream(physiicalFile)) {
				os.write(file.getBytes());
			}
			HttpSession session=req.getSession();
			UserEntity entity = (UserEntity) session.getAttribute("userDto");			
			System.out.println("Data is valid");
			userService.onSave(dto , entity.getEmail());
			
		
			
			model.addAttribute("successMsg", "UserParking Information "+dto.getLocation()+" saved successfully");
		}
		return "/Responseuser.jsp";
	}
	
	@GetMapping("/fetch")
	public String fetchAllData(UserDTO dto, UserParkingDTO dtos, HttpServletRequest req, HttpServletResponse response, Model model, String fileName, String contentType) throws IOException{
		System.out.println("Running fetchAllData");
		
		HttpSession session=req.getSession();
		UserEntity sessionDto = (UserEntity) session.getAttribute("userDto");	
		
		UserDTO list= userService.getAllUserInfo(sessionDto.getEmail());
		List<UserParkingDTO> list1=userService.getAllParkInfo(sessionDto.getEmail());
	
		model.addAttribute("userInfo",list1);
		System.out.println("viewing parking info "+list1);
		return "/UserView.jsp";
	}
	
	@GetMapping("/fileDownload")
	public void imageDownload(String fileName, String contentType, HttpServletResponse response) throws IOException{
		System.out.println("Running imageDownload");
		File file=new File(ApplicationConstant.FILE_LOCATION + fileName);
		response.setContentType(contentType);
		OutputStream outputStream=response.getOutputStream();
		FileInputStream in=new FileInputStream(file);
		byte[] buffer=new byte[4096];
		int length;
		
		while((length = in.read(buffer)) > 0) {
			outputStream.write(buffer,0,length);
		}
		in.close();
		outputStream.flush();
	}
	
	@GetMapping(value = "/update/{parkingId}")
	public String updateUser(@PathVariable("parkingId") int parkingId, HttpServletRequest req) {
		System.out.println("Inside updateUser method");
		
//		HttpSession session=req.getSession();
//		UserEntity sessionDto = (UserEntity) session.getAttribute("userDto");
		
		UserParkingDTO dto=userService.updateAllParkInfo(parkingId);
		
		req.setAttribute("parkingId", dto);
		RedirectView view=new RedirectView();
		view.setUrl(req.getContextPath()+"/");
		
		return "/UpdateUser.jsp";
	}
	
	@PostMapping(value = "/updateuserpark")
	public String update(@ModelAttribute UserParkingDTO dto, HttpServletRequest req) {
		System.out.println("Inside update method");
		
		userService.updateUserByIdSer(dto);
		req.setAttribute("parkingId", dto);
		
		return "/UserView.jsp";
	}
}
