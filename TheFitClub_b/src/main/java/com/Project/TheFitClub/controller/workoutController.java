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
import com.Project.TheFitClub.dao.workoutDao;
import com.Project.TheFitClub.model.exercises;
import com.Project.TheFitClub.model.users;
import com.Project.TheFitClub.model.workout;
import com.Project.TheFitClub.service.exerciseService;
import com.Project.TheFitClub.service.workoutService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/workout")
public class workoutController {
	
	@Autowired
	private exerciseService exerciseservice;	
	
	@Autowired
	private workoutService workoutservice;
	
	@Autowired
	private usersDao usersdao;
	
	@Autowired
	private workoutDao workoutdao;
	
	
	@GetMapping("/getExercise")
	public List<exercises> getAllExercises(){
		return exerciseservice.findAll();
	}
	
	//GET ALL WORKOUT LIST
	@GetMapping("/getWorkout")
	public List<workout> getAllWorkout(){
		return workoutdao.findAll();
	}
	
	
	// TRAINER CAN FETCH EXERCISE BY ID
	@GetMapping("/exercises/{exercise_id}")
	public ResponseEntity<Optional<exercises>> getExercise(@PathVariable int exercise_id){
		Optional<exercises> w = java.util.Optional.empty();
		try {
			w = exerciseservice.getById(exercise_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(w!=null)
			//return successful return
			return ResponseEntity.ok(w);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	

	//FOR TRAINER TO FETCH USERS WORKOUT BY USERID.
	@GetMapping("/getWorkoutById/{user_id}")
	public ResponseEntity<Optional<List<workout>>> getWorkoutById(@PathVariable int user_id){
		Optional<List<workout>> w = java.util.Optional.empty();
		try {
			w = workoutservice.getWorkoutById(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(w!=null)
			//return successful return
			return ResponseEntity.ok(w);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	  //TRAINER CAN ADD WORKOUT TO PERTICULAR USER
	  @PostMapping("/addWorkout/{user_id}") 
	  public ResponseEntity<String>addWorkout(@PathVariable("user_id")int user_id, @RequestBody workout w){
	  Optional<users> u = usersdao.findById(user_id);
	  
	  if(u.isEmpty()) { return ResponseEntity.notFound().build(); }else
	  
	  workoutservice.addWorkout(w); 
	  return ResponseEntity.ok("Added Successfully");
	  
	  }
	  
	  //UPDATE WORKOUT OF USER BY TRAINER
	   @PutMapping("/updateWorkout/{user_id}")
		public ResponseEntity<String> updateWorkout(@PathVariable("user_id") int user_id, @RequestBody workout w){
		Optional<users> ur = usersdao.findById(user_id);
				
		if(ur.isEmpty()) {
		return ResponseEntity.notFound().build();
		}else
		workoutservice.updateWorkout(w);
		return ResponseEntity.ok("modified successfully");
				
			}
	  
	 
}
