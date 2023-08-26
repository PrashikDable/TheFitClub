package com.Project.TheFitClub.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.trainer;

@Repository
public interface trainerDao extends JpaRepository<trainer,Integer>{
	
	@Query(value="select * from trainer where specialization=:specialization",nativeQuery=true)
	Optional<List<trainer>> getBySpecial(String specialization);
	
//	@Query(value="select * from trainer",nativeQuery=true)
//	List<trainer> findAllTrainers();

}
