package com.xworkz.parkingapp.dto;

import java.io.Serializable;
import java.time.LocalTime;
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
	private String loginTime;
//	private LocalTime otpExpiryTime;
	
	@Override
	public int compareTo(UserDTO o) {
		return this.userName.compareTo(o.getUserName());
	}
	
}