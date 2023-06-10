package com.xworkz.donationapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="blood_donation")
public class BloodGroupDTO implements Serializable, Comparable<BloodGroupDTO>{

	@Id
	@Column(name="id")
	private int id;
	
	@Size(min = 3,max = 30,message = "Person Name should be between 3 and 30")
	@Column(name="personName")
	private String personName;
	
	@NotEmpty(message = "Group must be selected")
	@Column(name="bloodgroup")
	private String group;
	
	@Min(value = 18, message = "Age should be greater than or equal to 18")
	@Max(value = 60, message = "Age should be less than 60")
	@Column(name="age")
	private int age;
	
	@NotEmpty
	@Size(min = 3, max = 40, message = "Address should be between 3 and 40")
	@Column(name="address")
	private String address;
	
	@Min(value = 50, message = "Weight should be more than 50,")
	@Column(name="weight")
	private double weight;
	
	private String fileName;
	
	private String contentType;
	
	private long fileSize;
	
	@Override
	public int compareTo(BloodGroupDTO o) {
		
		return this.getPersonName().compareTo(o.getPersonName());
	}
}
