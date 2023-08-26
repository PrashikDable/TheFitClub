package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.exercises;

public interface exerciseService {

	List<exercises> findAll();

	Optional<exercises> getById(int exercise_id);

	

	

}
