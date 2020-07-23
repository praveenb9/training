package com.capg.jpademo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.jpademo.model.Trainee;

public class TraineeDbOperations {
	

	public static void main(String[] args) {
		
	
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("trainee-unit");
		EntityManager em=emf.createEntityManager();
		//Trainee t1=new Trainee(101, "praveen", "oracle");
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		//em.persist(t1);
		Trainee t1=em.find(Trainee.class, 101);
	
//		em.detach(t1);
		t1.settName("king");
		tx.commit();
		System.out.println(t1);
	}
}
