package com.Project.TheFitClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.TheFitClub.model.users;
import com.Project.TheFitClub.service.usersService;

@RestController
@RequestMapping("/users")
public class usersController {

	@Autowired
	private usersService usersservice;
	
	@PostMapping("/add")
	public ResponseEntity<String> createPerson(@RequestBody users u){
		usersservice.addUser(u);
		return ResponseEntity.ok("Added Successfully");
	}
}
