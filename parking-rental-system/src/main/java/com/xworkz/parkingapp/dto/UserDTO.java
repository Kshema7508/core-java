package com.xworkz.parkingapp.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class UserDTO implements Serializable,Comparable<UserDTO>{

	private int userId;
	private String userName;
	private String email;
	private long mobileNo;
	private String oneTimePassword;
	private Date otpRequestedTime;
	
	@Override
	public int compareTo(UserDTO o) {
		return this.userName.compareTo(o.getUserName());
	}
	
}