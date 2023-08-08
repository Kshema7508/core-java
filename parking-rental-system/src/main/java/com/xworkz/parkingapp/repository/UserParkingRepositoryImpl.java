package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.UserEntity;
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
		System.out.println("Running findByUserId");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("fetch");
		query.setParameter("id", userId);
		List<UserParkingEntity> entities=query.getResultList();
		em.getTransaction().commit();
		System.out.println(entities);
		return entities;
	}

	@Override
	public UserParkingEntity updateByParkId(int parkingId) {
		System.out.println("Running updateByParkId");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("fetchpark");
		query.setParameter("pid", parkingId);
		Object object = query.getSingleResult();
		UserParkingEntity result = (UserParkingEntity) object;
		em.getTransaction().commit();
		System.out.println("Result from repo " + result);
		return result;
//		UserParkingEntity entities=(UserParkingEntity) query.getSingleResult();
//		em.getTransaction().commit();
//		System.out.println(entities);
//		return entities;	
	}

	@Override
	public UserParkingEntity updateUserInfo(UserParkingEntity entity) {
		System.out.println("Inside updateUserInfo");

		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Query query=em.createNamedQuery("updateuserinfo");
		query.setParameter("loc", entity.getLocation());
		query.setParameter("vtype", entity.getVehicleType()); 
		query.setParameter("vclass",entity.getVehicleType());
		query.setParameter("ter", entity.getTerms());
		query.setParameter("pr", entity.getPrice());
		query.setParameter("dis", entity.getDiscount());
		query.setParameter("tamount", entity.getTotalAmount());
		query.setParameter("fName", entity.getFileName());
		query.setParameter("id",entity.getParkingId());
		
		int in=query.executeUpdate();
		
		em.getTransaction().commit();
	
		return null;
	}

}
