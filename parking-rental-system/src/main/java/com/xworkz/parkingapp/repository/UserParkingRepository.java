package com.xworkz.parkingapp.repository;

import com.xworkz.parkingapp.entity.UserParkingEntity;

public interface UserParkingRepository {

	boolean saveInformation(UserParkingEntity entity);

}
