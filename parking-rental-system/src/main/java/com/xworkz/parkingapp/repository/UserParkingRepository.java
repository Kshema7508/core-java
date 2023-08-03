package com.xworkz.parkingapp.repository;

import java.util.List;

import com.xworkz.parkingapp.entity.UserParkingEntity;

public interface UserParkingRepository {

	boolean saveInformation(UserParkingEntity entity);

	List<UserParkingEntity> findByUserId(int userId);

}
