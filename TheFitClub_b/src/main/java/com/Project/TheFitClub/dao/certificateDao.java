package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.certificates;

@Repository
public interface certificateDao extends JpaRepository<certificates, Integer> {

}
