package com.Project.TheFitClub.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.workout;

@Repository
public interface workoutDao extends JpaRepository<workout, Integer>{
	
	
	@Query(value="SELECT * FROM workout WHERE workout_id IN (SELECT workout_id FROM user_workout WHERE user_id = :user_id)",nativeQuery=true)
	Optional<List<workout>> getWorkoutByUser(int user_id);
}
