package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import com.Project.TheFitClub.model.users;

public interface usersService {

	users addUser(users u);

	List<users> findAll();

	Optional<users> getById(int user_id);

	Optional<List<users>> getUserByTrainer(int trainer_id);

	void updateUser(users u);

	void updateTrainerId(int user_id, int trainer_id, users u);

	Optional<List<users>> getUsersBySubscription(int subscription_id);


}
