package com.xworkz.parkingapp.service;

import com.xworkz.parkingapp.dto.ParkingDTO;

public interface ParkingService {
	
	boolean sendMail(String email);

	ParkingDTO adminSinghIn(String emailId,String password) ;
}
