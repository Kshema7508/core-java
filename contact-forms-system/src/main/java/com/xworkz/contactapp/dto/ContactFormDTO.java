package com.xworkz.contactapp.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactFormDTO implements Serializable, Comparable<ContactFormDTO>{
	
	 private String personName;

	 private long mobileNo;

	 private String email;

	 private String comments;
	
	 private String fileName;
	
	 private String contentType;
	
	 private long fileSize;

	@Override
	public int compareTo(ContactFormDTO o) {
		
		return this.getPersonName().compareTo(o.getPersonName());
	}
}
