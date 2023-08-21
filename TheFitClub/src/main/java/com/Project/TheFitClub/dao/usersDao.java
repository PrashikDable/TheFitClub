package com.Project.TheFitClub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.users;

@Repository
public interface usersDao extends JpaRepository<users, Integer> {

}
