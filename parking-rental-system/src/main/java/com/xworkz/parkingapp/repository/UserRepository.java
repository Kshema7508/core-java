package com.xworkz.parkingapp.repository;

import com.xworkz.parkingapp.entity.UserEntity;

public interface UserRepository {

	boolean saveInformation(UserEntity entity);

	UserEntity findByUserEmail(String email);

	boolean userSignInUpdate(String oneTimePassword, String email);

}