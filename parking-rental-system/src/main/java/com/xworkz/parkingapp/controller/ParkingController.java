package com.xworkz.parkingapp.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.parkingapp.dto.ParkingDTO;
import com.xworkz.parkingapp.service.ParkingService;

@Controller
@Component
@RequestMapping("/")
public class ParkingController {
	
	@Autowired
	private ParkingService service;

	public ParkingController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/login")
	public String adminLogin(@RequestParam("emailId")String emailId,@RequestParam("password") String password,Model model,ParkingDTO dto,HttpServletRequest req) {
		System.out.println("Running adminLogin");
		
		ParkingDTO dtos=service.adminSinghIn(emailId,password);
		if(dtos !=null) {
			System.out.println(dtos);
			HttpSession session=req.getSession(true);
			session.setAttribute("dto", dtos);
//			model.addAttribute("name", dtos.getAdminName());
//			model.addAttribute("time", dtos.getLoginTime());
			return "/ParkingInfo.jsp";
		}
		System.out.println("Incorrect credential");
		model.addAttribute("error", "Invalid credential, please re-enter correct da ta");
		return "/Singhin.jsp";
	}
}
