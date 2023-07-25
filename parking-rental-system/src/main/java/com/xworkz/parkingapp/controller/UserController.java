package com.xworkz.parkingapp.controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;
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

//		userService.userSignIn(email, entity);
//		model.addAttribute("successMsg","OTP send to email successfully");
		//return "/Usersingin.jsp";
		
		
//		
//		if(entity !=null) {
//			userService.userSignIn(email, entity);
//			
//			return "/Usersingin.jsp";
//		}
//			if(dtos !=null) {
//			System.out.println(dtos);
//			
//			return "/UserLoginSuccess.jsp"; 
//			
//		}
//		System.out.println("Incorrect credential");
//		model.addAttribute("error", "Invalid credential, please re-enter correct data");
//		return "/Usersingin.jsp";
//		
//		
////		System.out.println("Incorrect credential");
////		model.addAttribute("error", "Invalid credential, please re-enter correct data");
//		//return "/Usersingin.jsp";
//
//	}
	
//	@PostMapping("/userLogin")
//	public String userLogin(@RequestParam("email") String email, @RequestParam("oneTimePassword") String oneTimePassword, Model model, UserDTO dto, HttpServletRequest req) {
//		System.out.println("Inside userLogin method");
//		
//		UserDTO dtos=userService.userLogin(email,oneTimePassword);
//		if(dtos !=null) {
//			System.out.println(dtos);
//			HttpSession session=req.getSession(true);
//			session.setAttribute("dto", dtos);
//			return "/UserLoginSuccess.jsp"; 
//		}
//
//		System.out.println("Incorrect credential");
//		model.addAttribute("error", "Invalid credential, please re-enter correct data");
//		return "/Usersingin.jsp";
//	}
	
}
