package com.xworkz.parkingapp.repository;

import java.util.List;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

public interface ParkingInfoRepository {

	boolean saveInformation(ParkingInfoEntity entity);

	List<ParkingInfoEntity> findByLocation(String location);

}
