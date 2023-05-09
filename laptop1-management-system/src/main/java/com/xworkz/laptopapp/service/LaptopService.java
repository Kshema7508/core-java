package com.xworkz.laptopapp.service;

import java.util.List;

import com.xworkz.laptopapp.dto.LaptopDTO;

public interface LaptopService {
	
	boolean sendMail(String email);

	LaptopDTO validateAndSave(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptopsSer();
	
	LaptopDTO getLaptopByIdSer(int id);
	
	List<LaptopDTO> getByCompanyNameSer(String companyName);

	void updateLaptopByIdSer(LaptopDTO dto);
	
}
