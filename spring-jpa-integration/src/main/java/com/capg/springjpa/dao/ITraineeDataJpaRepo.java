package com.capg.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springjpa.model.Trainee;

public interface ITraineeDataJpaRepo extends JpaRepository<Trainee, Integer>{

}
