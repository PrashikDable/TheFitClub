package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.exerciseDao;
import com.Project.TheFitClub.model.exercises;

@Service
public class exerciseServiceImpl implements exerciseService {
	
	@Autowired
	private exerciseDao exercisedao;

	@Override
	public List<exercises> findAll() {
		return exercisedao.findAll();
	}

	@Override
	public Optional<exercises> getById(int exercise_id) {
		return exercisedao.findById(exercise_id);
	}


	
	
	

}
