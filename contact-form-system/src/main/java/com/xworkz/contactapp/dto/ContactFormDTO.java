package com.xworkz.contactapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactFormDTO {

	 @Size(min = 3,max = 30,message = "Person Name should be between 3 and 30")
	 private String personName;
	
	 @Min(value = 10,message = "Mobile Number should be 10 digits")
	 private long mobileNo;
	 
	 @NotEmpty(message = "Email must be given")
	 private String email;
	 
	 @Size(min = 2,max = 200, message = "Comment should be between 2 and 200")
	 private String comments;
	 
	 private String fileName;
	 
	 private String contentType;
	 
	 private long fileSize;
}
