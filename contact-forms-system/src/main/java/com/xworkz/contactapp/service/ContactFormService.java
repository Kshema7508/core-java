package com.xworkz.contactapp.service;

import java.util.List;

import com.xworkz.contactapp.dto.ContactFormDTO;

public interface ContactFormService {

	boolean sendMail(String email);
	
	boolean validateAndsave(ContactFormDTO dto);

	 List<ContactFormDTO> findByName(String personName) ;
	

}