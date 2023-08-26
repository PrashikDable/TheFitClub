package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.trainer;

public interface trainerService {

	void addTrainer(trainer t);

	List<trainer> findAll();

	Optional<trainer> getById(int trainer_id);

	void updateTrainer(trainer t);

	Optional<List<trainer>> getBySpecialization(String specialization);

}
