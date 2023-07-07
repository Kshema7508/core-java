package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;
import com.xworkz.parkingapp.entity.UserEntity;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private EntityManagerFactory factory;
	
	public UserRepositoryImpl() {
		System.out.println("Inside UserRepositoryImpl");
	}
	
	@Override
	public UserEntity findByUserEmail(String email) {
		System.out.println("Inside findByUserEmail");
		
		EntityManager em=factory.createEntityManager();
		Query query=em.createNamedQuery("findByUserEmail");
		query.setParameter("mail", email);
		
		try {
			Object obj=query.getSingleResult();
			return (UserEntity) obj;
		}catch (Exception e) {
			return null;
		}finally {
			em.close();
		}
		
		
	}
	
	@Override
	public boolean saveInformation(UserEntity entity) {
		System.out.println("Running saveInformation");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	

}
