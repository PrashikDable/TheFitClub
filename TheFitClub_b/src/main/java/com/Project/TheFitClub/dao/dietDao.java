package com.Project.TheFitClub.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.diet;

@Repository
public interface dietDao extends JpaRepository<diet, Integer> {

	
	
	@Query(value="SELECT * FROM diet WHERE diet_id IN (SELECT diet_id FROM user_diet WHERE user_id = :user_id)",nativeQuery=true)
	Optional<List<diet>> getDietByUser(int user_id);


}
