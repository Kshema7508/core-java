package com.xworkz.parkingapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.UserParkingEntity;

@Repository
public class UserParkingRepositoryImpl implements UserParkingRepository{

	@Autowired
	private EntityManagerFactory factory;
	
	public UserParkingRepositoryImpl() {
		System.out.println("Inside UserParkingRepositoryImpl");
	}
	
	@Override
	public boolean saveInformation(UserParkingEntity entity) {
		System.out.println("Running saveInformation");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

}
