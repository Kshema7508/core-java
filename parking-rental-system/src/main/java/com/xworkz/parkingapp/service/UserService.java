package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;

public interface UserService {
	
	boolean sendMail(String email);

	boolean validateAndSave(UserDTO dto,  UserParkingDTO dtos);
	
	boolean otpSendMail(String email, UserEntity entity);
	
	boolean userSignIn(String email, UserEntity entity);

}
