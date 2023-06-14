package com.xworkz.contactapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contactapp.dto.ContactFormDTO;

@Component
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/start")
	public String onStart(Model model) {
		
		System.out.println("Running onStart from DefaultController");
		model.addAttribute("dto", new ContactFormDTO());
		return "/Contact.jsp";	
	}
}
