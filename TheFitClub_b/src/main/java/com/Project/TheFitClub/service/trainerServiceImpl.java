package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.trainerDao;
import com.Project.TheFitClub.model.trainer;

@Service
public class trainerServiceImpl implements trainerService{

	@Autowired
	trainerDao trainerdao;

	@Override
	public void addTrainer(trainer t) {
			trainerdao.save(t);
		
	}

	@Override
	public List<trainer> findAll() {
		return trainerdao.findAll();
	}

	@Override
	public Optional<trainer> getById(int trainer_id) {
		return trainerdao.findById(trainer_id);
	}

	@Override
	public void updateTrainer(trainer t) {
		trainerdao.save(t);
		
	}

	@Override
	public Optional<List<trainer>> getBySpecialization(String specialization) {
		Optional<List<trainer>> tslist=trainerdao.getBySpecial(specialization);
		return tslist;
	}
	
	
}
