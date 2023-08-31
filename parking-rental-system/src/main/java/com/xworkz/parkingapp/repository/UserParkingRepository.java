package com.xworkz.parkingapp.repository;

import java.util.List;

import com.xworkz.parkingapp.entity.UserParkingEntity;

public interface UserParkingRepository {

	boolean saveInformation(UserParkingEntity entity);

	List<UserParkingEntity> findByUserId(int userId);

	UserParkingEntity updateByParkId(int parkingId);

	UserParkingEntity updateUserInfo(UserParkingEntity entity);

	UserParkingEntity deleteByParkId(int parkingId);

}
