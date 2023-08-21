package com.Project.TheFitClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.usersDao;
import com.Project.TheFitClub.model.users;

@Service
public class usersServiceImpl implements usersService {

	@Autowired
	usersDao usersdao;

	@Override
	public void addUser(users u) {
		usersdao.save(u);
	}
	
	
}
