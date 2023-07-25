package com.xworkz.parkingapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.AdminEntity;
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

	@Override
	public boolean userSignInUpdate(String oneTimePassword, String email) {
		System.out.println("Inside userSignInUpdate");
		
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Query query=em.createNamedQuery("updateOTP");
		query.setParameter("mail", email);
		query.setParameter("oneTime", oneTimePassword);
		
		int in=query.executeUpdate();
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	@Override
	public UserEntity userLoginRepo(String email) {
		System.out.println("Running userLoginRepo ");

		EntityManager em = this.factory.createEntityManager();
		Query query = em.createNamedQuery("findByUserEmail");
		query.setParameter("mail", email);
		Object object = query.getSingleResult();
		UserEntity result = (UserEntity) object;
		System.out.println("Result from repo " + result);
		return result;
	}

	@Override
	public boolean updatedTime(UserEntity entity) {
		System.out.println("Running updatedTime");

		EntityManager em = this.factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();

		return true;
	}


}
