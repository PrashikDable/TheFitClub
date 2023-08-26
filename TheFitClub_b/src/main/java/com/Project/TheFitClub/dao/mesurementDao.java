package com.Project.TheFitClub.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.mesurements;

@Repository
public interface mesurementDao extends JpaRepository<mesurements, Integer> {
	
	@Query(value="SELECT m FROM mesurements m WHERE m.user_id.user_id = :user_id",nativeQuery=true)
	Optional<mesurements> getMesurement(int user_id);

}
