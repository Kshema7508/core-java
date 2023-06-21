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
@Table(name = "parking.admin_details")
@NamedQuery(name = "findByEmail",query = "select ee from AdminEntity ee where ee.emailId=:email")
public class AdminEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String adminName;
	
	private String emailId ;
	
	private String password;
	
	private String loginTime;
	
	private String createdBy;
	
	private String createdTime;
	
	private String updatedBy;
	
	private String updatedTime;
}