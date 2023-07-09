package com.xworkz.parkingapp.controller;

import java.io.IOException;

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
	public String sendOTP(@RequestParam("email") String email, Model model, UserEntity entity) {
		System.out.println("Running sendOTP method");
		
		//userService.otpSendMail(email,entity);
		userService.userSignIn(email, entity);
		model.addAttribute("successMsg","OTP send to email successfully");
		return "/Usersingin.jsp";
	}
}
