package com.xworkz.parkingapp.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ParkingDTO implements Serializable,Comparable<ParkingDTO>{

	
	@Size(min = 3,max = 30, message = "name should be between 3 and 30")
	private String adminName;
	
	@Size(min=3,max = 30,message = "Email cannot be less than 3 and greater than 20")
	private String emailId ;
	
	@NotBlank
	@Size(min = 3,max = 12,message = "The Password cannot be less than 3 and greater than 12")
	private String password;
	
	private String loginTime;
	
	private String createdBy;
	
	private String createdTime;
	
	private String updatedBy;
	
	private String updatedTime;

	@Override
	public int compareTo(ParkingDTO o) {
		return this.adminName.compareTo(o.getAdminName());
	}
	
}