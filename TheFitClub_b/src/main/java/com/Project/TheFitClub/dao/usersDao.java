package com.Project.TheFitClub.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Project.TheFitClub.model.users;

@Repository
public interface usersDao extends JpaRepository<users, Integer> {
	
	
	@Query(value="SELECT * FROM users WHERE trainer_id = :trainer_id",nativeQuery=true)
	Optional<List<users>> getUserByTrainer(int trainer_id);
	
	@Query(value="UPDATE users SET trainer_id= :trainer_id where user_id= :user_id",nativeQuery=true)
	void updateTrainerId(int user_id, int trainer_id, users u);
	
	
	@Query(value="select * from users where subscription_id = :subscription_id",nativeQuery=true)
	Optional<List<users>> getUsersBySubscription(int subscription_id);

}
