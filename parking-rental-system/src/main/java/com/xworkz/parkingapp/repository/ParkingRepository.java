package com.xworkz.parkingapp.repository;

import com.xworkz.parkingapp.entity.AdminEntity;

public interface ParkingRepository {

	AdminEntity userSingnInRepo(String emailId);

	boolean updatedTime(AdminEntity entity);
}