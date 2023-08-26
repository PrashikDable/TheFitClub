package com.Project.TheFitClub.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.TheFitClub.dao.usersDao;
import com.Project.TheFitClub.model.diet;
import com.Project.TheFitClub.model.nutrition;
import com.Project.TheFitClub.model.users;
import com.Project.TheFitClub.service.dietService;
import com.Project.TheFitClub.service.nutritionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/diet")
public class dietController {
	
	@Autowired
	private nutritionService nutritionservice;
	
	
	@Autowired
	private dietService dietservice;
	
	@Autowired
	private usersDao usersdao;
	
	//TRAINER CAN GET NUTRITION FROM HERE
	@GetMapping("/getNutrition")
	public List<nutrition> getAllNutrition(){
		return nutritionservice.findAll();
	}
	//TRAINER CAN ADD NUTRITION TO DIET TABLE OF USER;
	@GetMapping("/getNutrition/{nutrition_id}")
	public ResponseEntity<Optional<nutrition>> getNutritionById(@PathVariable int nutrition_id){
		Optional<nutrition> n = java.util.Optional.empty();
		try {
			n = nutritionservice.getNutritionById(nutrition_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(n!=null)
			//return successful return
			return ResponseEntity.ok(n);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//GET ALL DIETS
	@GetMapping("/getDiet")
	public List<diet> getAllDiet(){
		return dietservice.findAll();
	}
	//TRAINER CAN FETCH DIET BY USER
	@GetMapping("/getDiet/{user_id}")
	public ResponseEntity<Optional<List<diet>>> getDietByUser(@PathVariable int user_id){
		Optional<List<diet>> d = java.util.Optional.empty();
		try {
			d = dietservice.getDietByUser(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(d!=null)
			//return successful return
			return ResponseEntity.ok(d);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//TRAINER CAN ADD DIET TO CLIENT 
	@PostMapping("/addDiet/{user_id}")
	public ResponseEntity<String> addDiet(@PathVariable("user_id")int user_id, @RequestBody diet d){
		Optional<users> u = usersdao.findById(user_id);
		
		if(u.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else
		
		dietservice.addDiet(d);
		return ResponseEntity.ok("Added Successfully");
		
	}
	
	//TRAINER CAN UPDATE DIET OF USER
	@PutMapping("/updateDiet/{user_id}")
	public ResponseEntity<String> updateDiet(@PathVariable("user_id") int user_id, @RequestBody diet d){
		Optional<users> u = usersdao.findById(user_id);
		
		if(u.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else
			dietservice.updateDiet(d);
			return ResponseEntity.ok("modified successfully");
		
	}
	
	
//	@PutMapping("/update/{user_id}")
//	public ResponseEntity<String> updateDiet(@RequestBody diet d){
//		int n=dietService.updateDiet(d);
//		if(n>0) {
//			return ResponseEntity.ok("modified successfully");
//		}else {
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		}
//	}
	

	/*
	 * @GetMapping("/getDiet/{user_id}") public ResponseEntity<List<diet>>
	 * getUsersDiet(@PathVariable int user_id) { users u =
	 * usersdao.findById(user_id).orElse(null); if (u == null) { return
	 * ResponseEntity.notFound().build(); } List<diet> d = null; try { d =
	 * users.getDietlist(); } catch (Exception e) { e.printStackTrace(); } return
	 * ResponseEntity.ok(d); }
	 */

}
