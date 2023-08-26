package com.Project.TheFitClub.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.TheFitClub.dao.loginDao;
import com.Project.TheFitClub.model.login;

@Service
public class loginServiceImpl implements loginService {
	
	@Autowired
	private loginDao logindao;

	@Override
	public Optional<login> getVerifiedUser(String userName, String password) {
		Optional<login> v= logindao.getVerifiedUser(userName,password);
		return v;
	}


}
