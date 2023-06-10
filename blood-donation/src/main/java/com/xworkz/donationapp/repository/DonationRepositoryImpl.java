package com.xworkz.donationapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.donationapp.dto.BloodGroupDTO;

@Repository
public class DonationRepositoryImpl implements DonationRepository{

	@Autowired
	EntityManagerFactory factory;
	
	@Override
	public void savePerson(BloodGroupDTO dto) {
		System.out.println("Inside repository");
		
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(dto);
		em.getTransaction().commit();
		
	}

}