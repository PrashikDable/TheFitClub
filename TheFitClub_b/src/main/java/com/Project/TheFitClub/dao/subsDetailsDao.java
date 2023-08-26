package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.subsDetails;

@Repository
public interface subsDetailsDao extends JpaRepository<subsDetails, Integer> {

}
