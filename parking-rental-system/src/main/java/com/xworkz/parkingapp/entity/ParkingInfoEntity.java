package com.xworkz.parkingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="info_table")
@NamedQuery(name = "findByLocation", query = "select ent from ParkingInfoEntity as ent where ent.location=:loc")
public class ParkingInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String location;
	
	private String vehicleType;
	
	private String vehicleClassfi;
	
	private String terms;
	
	private String price;
	
	private String discount;
	
}