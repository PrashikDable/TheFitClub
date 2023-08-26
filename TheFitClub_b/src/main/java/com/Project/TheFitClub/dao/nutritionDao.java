package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.nutrition;

@Repository
public interface nutritionDao extends JpaRepository<nutrition, Integer> {

}
