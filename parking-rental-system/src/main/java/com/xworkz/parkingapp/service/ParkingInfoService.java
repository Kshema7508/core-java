package com.xworkz.parkingapp.service;

import java.util.List;

import com.xworkz.parkingapp.dto.ParkingInfoDTO;
import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoService {

	boolean validateAndSave(ParkingInfoDTO dto) ;

	List<ParkingInfoDTO> findByLocation(String location);

	ParkingInfoEntity findByAll(String location, String vehicleType, String vehicleClassfi, String terms);
}
