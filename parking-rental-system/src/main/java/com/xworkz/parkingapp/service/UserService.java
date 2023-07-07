package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;

public interface UserService {

	boolean validateAndSave(UserDTO dto,  UserParkingDTO dtos);
	
	boolean otpSendMail(String email);

}
