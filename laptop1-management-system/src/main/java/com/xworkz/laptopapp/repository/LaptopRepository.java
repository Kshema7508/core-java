package com.xworkz.laptopapp.repository;

import java.util.List;

import com.xworkz.laptopapp.dto.LaptopDTO;

public interface LaptopRepository {

	void saveLaptop(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptopRepo();
	
	List<LaptopDTO> getByCompanyNameRepo(String companyName);

	LaptopDTO getAllLaptopByIdRepo(int id);

	void updateLaptopByIdRepo(LaptopDTO dto);

	LaptopDTO deleteLaptopByIdRepo(int id);
}
