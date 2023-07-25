package com.xworkz.parkingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;
import com.xworkz.parkingapp.service.ParkingInfoService;

@RestController
@EnableWebMvc
@RequestMapping("/")
public class AjaxController {  
	
	@Autowired
	private ParkingInfoService parkingInfoService;

	public AjaxController() {
		System.out.println("Running AjaxController");
	}
	
	@GetMapping(value = "/userAjax/{location}/{vehicleType}/{vehicleClassfi}/{terms}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ParkingInfoEntity userAjax(@PathVariable String location,@PathVariable String vehicleType,@PathVariable String vehicleClassfi,@PathVariable String terms) {
		
		ParkingInfoEntity entity=this.parkingInfoService.findByAll(location, vehicleType, vehicleClassfi, terms);
		System.out.println("entity : "+entity);
		System.out.println(entity);
	
		return entity;
	}
}
