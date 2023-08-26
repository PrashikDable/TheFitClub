package com.Project.TheFitClub.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.login;

@Repository
public interface loginDao extends JpaRepository<login, Integer>{
	

	
	@Query(value="select * from login where user_name= :userName && password= :password",nativeQuery=true)
	Optional<login> getVerifiedUser(String userName, String password);

}
