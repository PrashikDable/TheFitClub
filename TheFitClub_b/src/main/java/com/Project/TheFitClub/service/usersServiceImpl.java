package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.usersDao;
import com.Project.TheFitClub.model.users;

@Service
public  class usersServiceImpl implements usersService {

	@Autowired
	usersDao usersdao;

	@Override
	public users addUser(users u) {
		return usersdao.save(u);
	}

	@Override
	public List<users> findAll() {
		return usersdao.findAll();
	}

	@Override
	public Optional<users> getById(int user_id) {
		return usersdao.findById(user_id);
	}

	@Override
	public Optional<List<users>> getUserByTrainer(int trainer_id) {
		Optional<List<users>> ulist=usersdao.getUserByTrainer(trainer_id);
		return ulist;
	}

	@Override
	public void updateUser(users u) {
		usersdao.save(u);
		
	}

	@Override
	public void updateTrainerId(int user_id, int trainer_id, users u) {
		usersdao.updateTrainerId(user_id,trainer_id,u);
	}

	@Override
	public Optional<List<users>> getUsersBySubscription(int subscription_id) {
		Optional<List<users>> uslist= usersdao.getUsersBySubscription(subscription_id);
		return uslist;
	}

	
	
	
	
	
}
