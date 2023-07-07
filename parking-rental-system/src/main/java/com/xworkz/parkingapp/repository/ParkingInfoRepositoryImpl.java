package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
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

	@Override
	public ParkingInfoEntity findByAll(String location, String vehicleType, String vehicleClassfi, String terms) {
		EntityManager em=null;
		try {
				System.out.println("Running findByAll in Repo");
				em=factory.createEntityManager();
				Query query=em.createNamedQuery("findByAll");
				query.setParameter("locat", location);
				query.setParameter("vtype", vehicleType);
				query.setParameter("vclass", vehicleClassfi);
				query.setParameter("ter", terms);
				
				Object singleResult=query.getSingleResult();
				if(singleResult != null) {
					ParkingInfoEntity entity = (ParkingInfoEntity) singleResult;
					return entity;
				}
		}
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		return null;
	}

}
