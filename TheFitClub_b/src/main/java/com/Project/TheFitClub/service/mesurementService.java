package com.Project.TheFitClub.service;

import java.util.Optional;

import com.Project.TheFitClub.model.mesurements;

public interface mesurementService {

	void addMesurements(mesurements m);

	Optional<mesurements> getById(int user_id);

	void updateMesurements(mesurements m);

}
