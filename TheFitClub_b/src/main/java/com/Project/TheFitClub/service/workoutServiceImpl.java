package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.exerciseDao;
import com.Project.TheFitClub.dao.workoutDao;
import com.Project.TheFitClub.model.exercises;
import com.Project.TheFitClub.model.workout;

@Service
public class workoutServiceImpl implements workoutService {
		
	@Autowired
	private workoutDao workoutdao;
	
	@Autowired
	private exerciseDao exercisedao;

	@Override
	public void addWorkout(workout w) {
		workoutdao.save(w);
	}


	@SuppressWarnings("deprecation")
	@Override
	public exercises getById(int exercise_id) {
		
		return exercisedao.getById(exercise_id);
	}


	@Override
	public Optional<List<workout>> getWorkoutById(int user_id) {
		Optional<List<workout>> wlist=workoutdao.getWorkoutByUser(user_id);
		return wlist;
	}


	@Override
	public void updateWorkout(workout w) {
		workoutdao.save(w);
		
	}
	
	
	
}
