package com.Project.TheFitClub.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.mesurementDao;
import com.Project.TheFitClub.model.mesurements;

@Service
public class mesurementServiceImpl implements mesurementService {
	
	@Autowired
	private mesurementDao mesurementdao;

	@Override
	public void addMesurements(mesurements m) {
		mesurementdao.save(m);
		
	}
	
	
	@Override
	public Optional<mesurements> getById(int user_id) {
		Optional <mesurements> m= mesurementdao.getMesurement(user_id);
		return m;
	}


	@Override
	public void updateMesurements(mesurements m) {
		mesurementdao.save(m);
		
	}

	
	
}
