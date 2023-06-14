package com.xworkz.contactapp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.contactapp.dto.ContactFormDTO;
import com.xworkz.contactapp.entity.ContactFormEntity;
import com.xworkz.contactapp.repository.ContactFormRepository;

@Service
public class ContactFormServiceImpl implements ContactFormService{

	@Autowired
	private ContactFormRepository repo;
	
	public ContactFormServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndsave(ContactFormDTO dto) {
		System.out.println("Inside validateAndsave");
		
		ContactFormEntity contactFormEntity=new ContactFormEntity();
		BeanUtils.copyProperties(dto, contactFormEntity);
		
		System.out.println("Evaluvating entity "+contactFormEntity);
			repo.savePerson(contactFormEntity);
		
		return false;
	}

}
