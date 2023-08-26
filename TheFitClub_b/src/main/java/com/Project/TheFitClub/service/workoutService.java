package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.exercises;
import com.Project.TheFitClub.model.workout;

public interface workoutService {

	void addWorkout(workout w);


    exercises getById(int exercise_id) ;


	Optional<List<workout>> getWorkoutById(int user_id);


	void updateWorkout(workout w);

}
