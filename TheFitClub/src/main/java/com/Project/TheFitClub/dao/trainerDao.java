package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.trainer;

@Repository
public interface trainerDao extends JpaRepository<trainer,Integer>{

}
