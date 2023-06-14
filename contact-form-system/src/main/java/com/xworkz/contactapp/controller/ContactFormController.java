package com.xworkz.contactapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contactapp.constants.ApplicationConstant;
import com.xworkz.contactapp.dto.ContactFormDTO;
import com.xworkz.contactapp.service.ContactFormService;

@Component
@RequestMapping("/")
@Controller
public class ContactFormController {

	private Set<ContactFormDTO> dtos=new TreeSet<>();
	
	@Autowired
	ContactFormService service;
	
	public ContactFormController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/save")
	public  String onSave(@Valid ContactFormDTO dto, BindingResult bindingResult, Model model, MultipartFile file) throws IOException {
		System.out.println("Running onSave "+dto);
		
		model.addAttribute("dtos",dto);
		
		if(bindingResult.hasErrors()) {
			System.out.println("Data is invalid");
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			
			return "/Contact.jsp";
		}
		else {
			System.out.println("File received: "+file.getName());
			System.out.println("File Size: "+file.getSize());
			System.out.println("File Type: "+file.getContentType());
			System.out.println("File bytes: "+file.getBytes());
			
			//dto.setFileName(System.currentTimeMillis()+ "-" +file.getOriginalFilename());
			dto.setFileName(file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileSize(file.getSize());
			
			File physiicalFile = new File(ApplicationConstant.FILE_LOCATION + dto.getFileName());
			
			try (OutputStream os = new FileOutputStream(physiicalFile)) {
				os.write(file.getBytes());
			}
			
			System.out.println("Data is valid");
			service.validateAndsave(dto);
			model.addAttribute("successMsg", "Contact form of "+dto.getPersonName()+" saved successfully");
		}
		return "/Response.jsp";
	}
	
	@GetMapping("/fileDownload")
	public void sendImage(String fileName, String contentType, HttpServletResponse response) throws IOException{
		System.out.println("Running sendImage");
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
	
	@GetMapping("/list")
	public String showData(Model model) {
		System.out.println("Running showData");
		model.addAttribute("dtos",this.dtos);
		return  "/Display.jsp";
	}
}
