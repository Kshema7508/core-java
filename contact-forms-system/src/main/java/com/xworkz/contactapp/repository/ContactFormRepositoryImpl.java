package com.xworkz.contactapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.contactapp.entity.ContactFormEntity;

@Repository
public class ContactFormRepositoryImpl implements ContactFormRepository{

	@Autowired
	EntityManagerFactory factory;
	
	public ContactFormRepositoryImpl() {
		System.out.println("Inside ContactFormRepositoryImpl");
	}
	
	@Override
	public boolean savePerson(ContactFormEntity entity) {
		System.out.println("Inside savePerson");
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

}
