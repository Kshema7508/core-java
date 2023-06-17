package com.xworkz.contactapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contact_form")
@NamedQuery(name="findByName", query = "select info from ContactFormEntity as info where info.personName like :nm")
public class ContactFormEntity {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="personName")
	private String personName;
	
	@Column(name="mobileNo")
	private long mobileNo;
	
	@Column(name="email")
	private String email;
	
	 @Column(name="comment")
	 private String comments;
	 
	@Column(name="fileName")
	private String fileName;
	
	@Column(name="contentType") 
	private String contentType;
	
	@Column(name="fileSize") 
	private long fileSize;
	
}