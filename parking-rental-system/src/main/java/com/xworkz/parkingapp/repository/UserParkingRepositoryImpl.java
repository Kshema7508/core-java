package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

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

	@Override
	public List<UserParkingEntity> findByUserId(int userId) {
		System.out.println("Running saveInformation");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("fetch");
		query.setParameter("id", userId);
		List<UserParkingEntity> entities=query.getResultList();
		em.getTransaction().commit();
		return entities;
	}

}
