package com.xworkz.parkingapp.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.service.UserParkingService;

@Component
@RequestMapping("/")
public class UserParkingController {

//	@Autowired
//	private UserParkingService userParkingService;
//	
//	public UserParkingController() {
//		System.out.println("Created "+this.getClass().getSimpleName());
//	}
//	
//	@PostMapping("/userSave")
//	public String userParkSave(@Valid UserParkingDTO dto, BindingResult bindingResult, Model model) throws IOException {
//		System.out.println("Running userParkSave");
//		
//		if(bindingResult.hasFieldErrors()) {
//			System.out.println("Data is Invalid");
//			model.addAttribute("errors",bindingResult.getAllErrors());
//			model.addAttribute("dto",dto);
//			
//			return "/Userinfo.jsp";
//		}
//		else {
//			System.out.println("Data is Valid");
//			userParkingService.validateAndSave(dto);
//			model.addAttribute("successMsg","UserParking Information "+dto.getLocation()+" saved successfully");
//		}
//		return "/Responseuser.jsp";
//	}
}