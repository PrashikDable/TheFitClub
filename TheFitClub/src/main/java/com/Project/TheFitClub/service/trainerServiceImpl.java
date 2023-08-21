package com.Project.TheFitClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.trainerDao;
import com.Project.TheFitClub.model.trainer;

@Service
public class trainerServiceImpl implements trainerService{

	@Autowired
	trainerDao trainerdao;

	@Override
	public void addPerson(trainer t) {
			trainerdao.save(t);
		
	}
}
