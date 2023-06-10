package com.xworkz.donationapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.donationapp.dto.BloodGroupDTO;
import com.xworkz.donationapp.repository.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService{

	@Autowired
	private DonationRepository repo;
	
	@Override
	public void validateAndsave(BloodGroupDTO dto) {
		System.out.println("Inside validateAndsave");
		
			repo.savePerson(dto);
		
	}

}