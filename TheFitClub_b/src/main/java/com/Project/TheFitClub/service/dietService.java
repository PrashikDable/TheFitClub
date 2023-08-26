package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.diet;

public interface dietService {

	void addDiet(diet d);

	List<diet> findAll();

	Optional<List<diet>> getDietByUser(int user_id);

	int updateDiet(diet d);



}
