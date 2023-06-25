package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

@Repository
public class ParkingInfoRepositoryImpl implements ParkingInfoRepository{

	@Autowired
	private EntityManagerFactory factory;
	
	public ParkingInfoRepositoryImpl() {
		System.out.println("Inside ParkingInfoRepositoryImpl");
	}
	
	@Override
	public boolean saveInformation(ParkingInfoEntity entity) {
		System.out.println("Running saveInformation");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	@Override
	public List<ParkingInfoEntity> findByLocation(String location) {
		System.out.println("Running findByName in repo..."+ location);
		
		EntityManager em=factory.createEntityManager();
		Query query=em.createNamedQuery("findByLocation");
		query.setParameter("loc", location);
		List<ParkingInfoEntity> result=query.getResultList();
		System.out.println("Result from repo "+result);
		em.close();
		
		return result;
	}

}
