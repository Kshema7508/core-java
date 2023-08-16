package com.xworkz.parkingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="userparking_details")
@NamedQueries({
@NamedQuery(name="fetch", query="select entity from UserParkingEntity as entity where entity.userId=:id"),
@NamedQuery(name="fetchpark", query="select entity from UserParkingEntity as entity where entity.parkingId=:pid"),
@NamedQuery(name = "updateuserinfo", query = "update UserParkingEntity entity set entity.location=:loc, entity.vehicleType=:vtype,entity.vehicleClassfi=:vclass, entity.terms=:ter, entity.price=:pr, entity.discount=:dis, entity.totalAmount=:tamount, entity.fileName=:fName where entity.parkingId=:pid")})
public class UserParkingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
