package com.capg.springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.springjpa.model.Trainee;

@Repository
public class TraineeJpaRepo implements ITraineeJpaRepo {

	@PersistenceContext
	EntityManager em;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		Trainee tr=em.find(Trainee.class, trainee.getTraineeId());
		if(tr!=null)
		{       
			throw new RuntimeException("Trainee Already Exists");
		}
		return em.merge(trainee);
		}

	@Override
	public Trainee getTrainee(int traineeId) {
		// TODO Auto-generated method stub
		return em.find(Trainee.class, traineeId);
	}

	@Override
	public List<Trainee> getAllTrainees() {

		Query qr= em.createQuery("from Trainee");
		return qr.getResultList();
	}
	
	public void deleteTrainee(int traineeId)
	{
		Trainee tr=em.find(Trainee.class, traineeId);
		if(tr!=null)
		{
		em.remove(tr);
		}
	}
}
