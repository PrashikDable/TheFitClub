package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.subscription;

@Repository
public interface subscriptionDao extends JpaRepository<subscription, Integer>{

}