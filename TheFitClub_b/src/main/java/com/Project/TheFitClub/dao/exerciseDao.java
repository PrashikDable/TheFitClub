package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.exercises;

@Repository
public interface exerciseDao extends JpaRepository<exercises, Integer> {
	
	

}
