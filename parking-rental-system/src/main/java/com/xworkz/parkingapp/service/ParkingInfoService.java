package com.xworkz.parkingapp.service;

import java.util.List;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;

public interface ParkingInfoService {

	boolean validateAndSave(ParkingInfoDTO dto) ;

	List<ParkingInfoDTO> findByLocation(String location);
}
