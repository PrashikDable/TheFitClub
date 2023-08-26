package com.Project.TheFitClub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.dietDao;
import com.Project.TheFitClub.model.diet;

@Service
public class dietServiceImpl implements dietService {
	 
	@Autowired
	private dietDao dietdao;

	public void addDiet(diet d) {
		dietdao.save(d);
		
	}

	@Override
	public List<diet> findAll() {
		return dietdao.findAll();
	}

	
	@Override
	public Optional<List<diet>> getDietByUser(int user_id) {
		Optional<List<diet>> dlist= dietdao.getDietByUser(user_id);
		return dlist;
	}

	@Override
	public int updateDiet(diet d) {
	   diet b=dietdao.save(d);
	   if(b==null) {
	     return 0;
	   }else
		   return 1;
		
	}


	

	
	
}
