package com.Project.TheFitClub.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.TheFitClub.model.login;
import com.Project.TheFitClub.service.loginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
public class loginController {
	
	@Autowired
	private loginService loginservice;
	
	@GetMapping("/{userName}/{password}")
	public ResponseEntity<Optional<login>> getVerifiedUser(@PathVariable String userName,@PathVariable String password){
		Optional<login> u = loginservice.getVerifiedUser(userName,password);
		
		if(u!=null)
			//return successful return
			return ResponseEntity.ok(u);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
