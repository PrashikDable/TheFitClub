package com.Project.TheFitClub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.certificateDao;
import com.Project.TheFitClub.model.certificates;

@Service
public class certificateServiceImpl implements certificateService {
	
	@Autowired
	private certificateDao certificatedao;

	@Override
	public void addCertificate(certificates c) {
		certificatedao.save(c);
		
	}
	
	
}
