package com.xworkz.parkingapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.AdminEntity;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

	@Autowired
	private EntityManagerFactory factory;

	public ParkingRepositoryImpl() {
		System.out.println("Running ParkingRepositoryImpl");
	}

	@Override
	public AdminEntity userSingnInRepo(String emailId) {
		System.out.println("Running userSingnInRepo");

		EntityManager em = this.factory.createEntityManager();
		Query query = em.createNamedQuery("findByEmail");
		query.setParameter("email", emailId);
		Object object = query.getSingleResult();
		AdminEntity result = (AdminEntity) object;
		System.out.println("Result from repo " + result);
		return result;
	}

	@Override
	public boolean updatedTime(AdminEntity entity) {
		System.out.println("Running updatedTime");

		EntityManager em = this.factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();

		return false;
	}

}
