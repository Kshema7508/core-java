package com.xworkz.contactapp.service;

import com.xworkz.contactapp.dto.ContactFormDTO;

public interface ContactFormService {

	boolean sendMail(String email);
	
	boolean validateAndsave(ContactFormDTO dto);
	
}