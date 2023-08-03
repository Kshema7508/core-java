package com.xworkz.parkingapp.dto;

import lombok.Data;

@Data
public class UserParkingDTO {

	private int parkingId;
	private int userId;
	private String location;
	private String vehicleType;
	private String vehicleClassfi;
	private String terms;
	private String price;
	private String discount;
	private int totalAmount;
	private String fileName;
	private String contentType;
	private long fileSize;
	
}