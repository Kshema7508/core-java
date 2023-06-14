package com.xworkz.contactapp.service;

import com.xworkz.contactapp.dto.ContactFormDTO;

public interface ContactFormService {

	boolean validateAndsave(ContactFormDTO dto);
}
