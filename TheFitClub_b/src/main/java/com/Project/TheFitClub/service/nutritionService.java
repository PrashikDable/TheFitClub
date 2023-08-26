package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.nutrition;

public interface nutritionService {

	List<nutrition> findAll();

	Optional<nutrition> getNutritionById(int nutrition_id);

}
