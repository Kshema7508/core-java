package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.ParkingDTO;

public interface ParkingService {
	
	boolean sendMail(String email);

	ParkingDTO userSinghIn(String emailId,String password) ;
}
