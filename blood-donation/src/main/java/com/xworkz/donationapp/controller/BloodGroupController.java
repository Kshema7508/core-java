package com.xworkz.donationapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.donationapp.constants.ApplicationConstant;
import com.xworkz.donationapp.dto.BloodGroupDTO;
import com.xworkz.donationapp.service.DonationService;

@Component
@RequestMapping("/")
@Controller
public class BloodGroupController {
	
	private Set<BloodGroupDTO> dtos=new TreeSet<>();

	public BloodGroupController() {
		System.out.println("Created "+ this.getClass().getSimpleName());
	}
	
	@Autowired
	DonationService service;
	
	@PostMapping("/donate")
	public String onDonate(@Valid BloodGroupDTO dto, BindingResult bindingResult, Model model, MultipartFile file) throws IOException{
		System.out.println("Running on donate" +dto);
		
		model.addAttribute("dtos",dto);
		
		if(bindingResult.hasErrors()) {
			System.err.println("Data is invalid");
			List<ObjectError> errors=bindingResult.getAllErrors();
			errors.forEach(ob -> System.err.println(ob.getDefaultMessage())); //? - dividing url into form parameter
			model.addAttribute("errors",errors);
			
			model.addAttribute("dto",dto); //it is used to get the first time filling data if any field is invalid. for second time filling correct filed will be already given we can change only invalid data
			return "/BloodGroup.jsp";
		}
		else {
			System.out.println("File received: "+ file.getName());
			System.out.println("File Size "+ file.getSize());
			System.out.println("File Type "+ file.getContentType());
			System.out.println("File bytes "+ file.getBytes());
			
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			File physicalFile=new File(ApplicationConstant.FILE_LOCATION + dto.getFileName());
			
			try (OutputStream os=new FileOutputStream(physicalFile)) {
					os.write(file.getBytes());
			}
			
			service.validateAndsave(dto);
			
			this.dtos.add(dto);
			System.out.println("Dto added to set, with total" + this.dtos.size());
			
			System.out.println("Data is valid");
			model.addAttribute("successMsg", "Blood Group of "+dto.getPersonName()+" saved successfully...");
		}
		return "/Response.jsp";
	}
	
	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException{
		System.out.println("Running sendImage...");
		//STEP 1: Get ref of the File, by name passed
		File file=new File(ApplicationConstant.FILE_LOCATION + fileName);
		//STEP 2: Set content Type
		response.setContentType(contentType);
		//STEP 3: Write File as Bytes to response
		OutputStream outputStream=response.getOutputStream();
		FileInputStream in=new FileInputStream(file);
		byte[] buffer= new byte[4096];
		int length;
		
		while((length = in.read(buffer)) > 0) {
			outputStream.write(buffer,0,length);
		}
		in.close();
		outputStream.flush();
	}
	
	@GetMapping("/list")
	public String showData(Model model) {
		System.out.println("Running showData");
		model.addAttribute("dtos",this.dtos);
		return  "/Display.jsp";
	}
}
