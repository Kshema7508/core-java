package com.xworkz.parkingapp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;
import com.xworkz.parkingapp.entity.UserParkingEntity;
import com.xworkz.parkingapp.repository.UserParkingRepository;

@Service
public class UserParkingServiceImpl implements UserParkingService{

//	@Autowired
//	private UserParkingRepository parkingRepository;
//	
//	public UserParkingServiceImpl() {
//		System.out.println("Inside UserParkingServiceImpl");
//	}
//	
//	@Override
//	public boolean validateAndSave(UserParkingDTO dto) {
//		System.out.println("Running validateAndSave");
//		
//		UserParkingEntity entity=new UserParkingEntity();
//		BeanUtils.copyProperties(dto, entity);
//		System.out.println("Evaluvating entity "+entity);
//		parkingRepository.saveInformation(entity);
//		 
//		return true;
//	}

}
