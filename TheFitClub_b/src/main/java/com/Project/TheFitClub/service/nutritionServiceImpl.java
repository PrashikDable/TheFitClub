package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.nutritionDao;
import com.Project.TheFitClub.model.nutrition;

@Service
public class nutritionServiceImpl implements nutritionService {
	 
	@Autowired
	private nutritionDao nutritiondao;

	@Override
	public List<nutrition> findAll() {
		return nutritiondao.findAll();
	}

	@Override
	public Optional<nutrition> getNutritionById(int nutrition_id) {
		Optional<nutrition> n= nutritiondao.findById(nutrition_id);
		return n;
	}
}
