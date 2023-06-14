package com.xworkz.contactapp.entity;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="contact_form")
public class ContactFormEntity {

	@Column(name="id")
	private int id;
	@Column(name="personName")
	private String personName;
	@Column(name="mobileNo")
	private long mobileNo;
	@Column(name="email")
	private String email;
	@Column(name="fileName")
	private String fileName;
	@Column(name="contentType") 
	private String contentType;
	@Column(name="fileSize") 
	private long fileSize;
	
}