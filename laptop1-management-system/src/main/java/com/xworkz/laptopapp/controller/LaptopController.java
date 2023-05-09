package com.xworkz.laptopapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.xworkz.laptopapp.dto.LaptopDTO;
import com.xworkz.laptopapp.service.LaptopService;

@Controller
@RequestMapping("/")
@Component
public class LaptopController {

	@Autowired
	LaptopService service;
	
	//@RequestMapping(value="/registerLaptop", method=requestMethod.POST)
	
	@PostMapping("/registerLaptop")
	public String registerLaptop(@ModelAttribute LaptopDTO dto, HttpServletRequest req) {
		//@ModelAttribute helps to convert from fields into object
		System.out.println("inside controller's registerLaptop method");
		if(dto!=null) {
			
			
			service.validateAndSave(dto);
			req.setAttribute("name", dto.getCompanyName());
			return "success";
		}
		return "failure";
		
	}
	
	@GetMapping("/listofLaptops")
	public String getAllLaptops(LaptopDTO dto, HttpServletRequest req) {
		System.out.println("Inside getAllLaptops method");
		
		List<LaptopDTO> dtos=service.getAllLaptopsSer();
		
		req.setAttribute("laptops", dtos);
		
		return "success";
	} 
	
	@GetMapping("/searchByCompanyName")
	public String searchByCompanyName(@RequestParam("companyName") String companyName, HttpServletRequest req) {
		System.out.println("Inside searchByCompanyName");
		
		List<LaptopDTO> dtos=service.getByCompanyNameSer(companyName);
		
		req.setAttribute("laptops", dtos);
		
		return "success";
		
	}
	
	@GetMapping(value = "/update/{laptopId}")
	public String updateLaptop(@PathVariable("laptopId") int id, HttpServletRequest req) {
		System.out.println("Inside updateLaptop method");
		
		LaptopDTO dto=service.getLaptopByIdSer(id);
		req.setAttribute("laptop", dto);
		RedirectView view=new RedirectView();
		view.setUrl(req.getContextPath()+"/");
		
		return "update_laptop";
		
	}
	
	@PostMapping(value = "/updatelaptop")
	public String update(@ModelAttribute LaptopDTO dto, HttpServletRequest req) {
		System.out.println("Inside update method");
		
		service.updateLaptopByIdSer(dto);
		req.setAttribute("laptop", dto);
		
		return "success";
		
	}
	
	
}
