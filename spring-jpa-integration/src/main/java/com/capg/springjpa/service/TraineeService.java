package com.capg.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springjpa.dao.ITraineeDataJpaRepo;
import com.capg.springjpa.dao.ITraineeJpaRepo;
import com.capg.springjpa.model.Trainee;

@Service
public class TraineeService implements ITraineeService {

	@Autowired
	ITraineeJpaRepo repo;
	
	@Autowired
	ITraineeDataJpaRepo dataJpaRepo;
	
	@Override
	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		//return repo.addTrainee(trainee);
		if (dataJpaRepo.existsById(trainee.getTraineeId()))
		{
			throw new RuntimeException("Trainee Already exists");
		}
		return dataJpaRepo.save(trainee);
	}

	@Override
	@Transactional
	public Trainee getTrainee(int traineeId) {
		
		//return repo.getTrainee(traineeId);
		return dataJpaRepo.getOne(traineeId);
	}

	@Override
	@Transactional
	public List<Trainee> getAllTrainees() {

		//return repo.getAllTrainees();
		return dataJpaRepo.findAll();
	}

	@Override
	@Transactional
	public void deleteTrainee(int traineeId) {

		//repo.deleteTrainee(traineeId);
		dataJpaRepo.deleteById(traineeId);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {

		Trainee tr = dataJpaRepo.getOne(trainee.getTraineeId());
		tr.setTraineeDomain(trainee.getTraineeDomain());
		tr.setTraineeName(trainee.getTraineeName());
		tr.setTraineeLocation(trainee.getTraineeLocation());
		return dataJpaRepo.save(tr);
	}

}
