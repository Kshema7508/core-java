package com.xworkz.parkingapp.service;

import java.util.List;

import javax.validation.Valid;

import com.xworkz.parkingapp.dto.UserDTO;
import com.xworkz.parkingapp.dto.UserParkingDTO;
import com.xworkz.parkingapp.entity.UserEntity;

public interface UserService {
	
	boolean sendMail(String email);

	boolean validateAndSave(UserDTO dto,  UserParkingDTO dtos);
	
	boolean otpSendMail(String email, UserEntity entity);
	
	UserEntity userSignIn(String email, UserEntity entity);

	UserDTO userLogin(String email, String oneTimePassword);

	UserEntity findByUserEmail(String email);

	void onSave(UserParkingDTO dto, String email);

	UserDTO getAllUserInfo(String email);

	List<UserParkingDTO> getAllParkInfo(String email);

	
}
