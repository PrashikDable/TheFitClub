package com.Project.TheFitClub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.TheFitClub.model.trainer;
import com.Project.TheFitClub.service.trainerService;

@RestController
@RequestMapping("/trainer")
public class trainerController {

	@Autowired
	private trainerService trainerservice;
	
	@PostMapping("/add")
	public ResponseEntity<String> createPerson(@RequestBody trainer t){
		trainerservice.addPerson(t);
		return ResponseEntity.ok("Added Successfully");
		
	}	
}
