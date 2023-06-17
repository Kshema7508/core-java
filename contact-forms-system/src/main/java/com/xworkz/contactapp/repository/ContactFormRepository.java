package com.xworkz.contactapp.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.contactapp.entity.ContactFormEntity;

public interface ContactFormRepository {

	boolean savePerson(ContactFormEntity entity);

	default List<ContactFormEntity> findByName(String personName){
		return Collections.emptyList();
		
	}

}
