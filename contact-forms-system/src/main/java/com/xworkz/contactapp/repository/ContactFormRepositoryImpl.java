package com.xworkz.contactapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

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

	@Override
	public List<ContactFormEntity> findByName(String personName) {
		System.out.println("Running findByName in repo..." + personName);
		
		EntityManager entityManager=factory.createEntityManager();
		Query query=entityManager.createNamedQuery("findByName");
		query.setParameter("nm","%"+personName+"%");
		List<ContactFormEntity> result = query.getResultList();
		System.out.println("Result from repo"+result);
		entityManager.close();
		return result;
	}

}
