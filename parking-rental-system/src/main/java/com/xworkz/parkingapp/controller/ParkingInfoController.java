package com.xworkz.parkingapp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.service.ParkingInfoService;

@Component
@RequestMapping("/")
public class ParkingInfoController {
	
	 
	@Autowired
	private ParkingInfoService infoService;
	
	public ParkingInfoController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/save")
	public String onSave(@Valid ParkingInfoDTO dto,BindingResult bindingResult,Model model) throws IOException{
		System.out.println("Running onsave");
		
		model.addAttribute("dtos",dto);
		if(bindingResult.hasErrors()) {
			System.out.println("Data is invalid");
			model.addAttribute("errors",bindingResult.getAllErrors());
			model.addAttribute("dto",dto);
			
			return "/Information.jsp";
		}
		else {
			System.out.println("Data is valid");
			infoService.validateAndSave(dto);
			model.addAttribute("successMsg","Parking Information of "+dto.getLocation()+" saved successfully");
		}
		return "/Response.jsp";
	}
	
	@GetMapping("/search")
	public  String onSearch(Model model, String location) {
		System.out.println("Running onSearch with param "+location);
		List<ParkingInfoDTO> list=infoService.findByLocation(location);
		model.addAttribute("list",list);
		return "/View.jsp";
	}
}
