package com.Project.TheFitClub.service;

import java.util.Optional;

import com.Project.TheFitClub.model.login;

public interface loginService {

	Optional<login> getVerifiedUser(String userName, String password);

}
