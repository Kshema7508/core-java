package com.xworkz.contactapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.contactapp.entity.ContactFormEntity;

public class ContactFormRepositoryImpl implements ContactFormRepository{

	@Autowired
	EntityManagerFactory factory;
	
	public ContactFormRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean savePerson(ContactFormEntity entity) {
		System.out.println("Inside savePerson");
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		
		return false;
	}

}
