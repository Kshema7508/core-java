package com.xworkz.parkingapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingapp.dto.ParkingDTO;

@Component
@RequestMapping("/")
public class DefaultController {

	public DefaultController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/start")
	public String onStart(Model model) {
		System.out.println("Running onStart");
		model.addAttribute("dto",new ParkingDTO());
		return "/Home.jsp";
	}
}
