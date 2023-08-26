package com.Project.TheFitClub.controller;

import java.io.IOException;
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
import com.Project.TheFitClub.model.mesurements;
import com.Project.TheFitClub.model.users;
import com.Project.TheFitClub.service.mesurementService;
import com.Project.TheFitClub.service.usersService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class usersController {

	@Autowired
	private usersService usersservice;
	
	@Autowired
	private mesurementService mesurementservice;
	
	
	@Autowired
	private usersDao usersdao;
	
	//ADMIN CAN GET ALL USERS
	@GetMapping("/getUsers")
	public List<users> getAllUsers(){
		return usersservice.findAll();
	}
	
	//USERS DETAILS BY ID
	@GetMapping("/getUsers/{user_id}")
	public ResponseEntity<Optional<users>> getUser(@PathVariable int user_id){
		Optional<users> u=usersservice.getById(user_id);
		if(u!=null)
			//return successful return
			return ResponseEntity.ok(u);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//USER REGISTRATION
//	@PostMapping("/addUser")
//	public ResponseEntity<String> createUser(@RequestBody users u){
//		usersservice.addUser(u);
//		return ResponseEntity.ok("Added Successfully");
//	}
	
//	@PostMapping("/Registration")
//	public ResponseEntity<users> RegisterUser(@RequestBody users u){
//		try {
//			 users user = new users();
//			    user.setName(u.getName());
//	            user.setDOB(u.getDOB());
//	            user.setProfile_pic(u.getProfile_pic().getBytes());
//	            user.setGender(u.getGender());
//	            user.setEmail(u.getEmail());
//	            user.setPhoneNo(u.getPhoneNo());
//	            user.setCity(u.getCity());
//	            user.setCountry(u.getCountry());
//	            user.setFitnessGoal(u.getFitnessGoal());
//	            user.setWeight(u.getWeight());
//	            user.setDietPreference(u.getDietPreference());
//	            
//	            users saveuser= usersservice.addUser(user);
//	            return ResponseEntity.status(HttpStatus.CREATED).body(saveuser);
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//	            
//		}
//	}
//	
	
	
	
	//UPDATE USER PROFILE
	@PutMapping("/updateUser/{user_id}")
	public ResponseEntity<String> updateUser(@PathVariable("user_id") int user_id, @RequestBody users u){
	Optional<users> ur = usersdao.findById(user_id);
			if(ur.isEmpty()) {
				return ResponseEntity.notFound().build();
			}else
				usersservice.updateUser(u);
				return ResponseEntity.ok("modified successfully");	
		}
	
	//TO GET MAPPED TRAINER TO USER
	@PutMapping("/updateUser/{user_id}/{trainer_id}")
	public ResponseEntity<String> updateUserTrainerId(@PathVariable("user_id") int user_id,@PathVariable("trainer_id")int trainer_id, @RequestBody users u){
	Optional<users> ur = usersdao.findById(user_id);
			if(ur.isEmpty()) {
				return ResponseEntity.notFound().build();
			}else
				usersservice.updateTrainerId(user_id,trainer_id,u);
				return ResponseEntity.ok("modified successfully");	
		}
	
	
	//USERS CAN ADD THERE MESUREMNTS
	@PostMapping("/mesurements/{user_id}")
	public ResponseEntity<String> addMesurements(@PathVariable("user_id") int user_id,@RequestBody mesurements m){
    Optional<users> u = usersdao.findById(user_id);
		
		if(u.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else
		
		mesurementservice.addMesurements(m);
		return ResponseEntity.ok("Added Successfully");
		
	}
	
	//TRAINER WILL GET USERS MESUREMENTS FOR ASSESSMENT.
	@GetMapping("/getUserMesurements/{user_id}")
	public ResponseEntity<Optional<mesurements>> getUserMesurements(@PathVariable int user_id){
		Optional<mesurements> m = java.util.Optional.empty();
		try {
			m = mesurementservice.getById(user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(m!=null)
			//return successful return
			return ResponseEntity.ok(m);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	    // USER CAN UPDATE MESUREMENTS
		@PutMapping("/updateMesurements/{user_id}")
		public ResponseEntity<String> updateMesurements(@PathVariable("user_id") int user_id, @RequestBody mesurements m){
		Optional<users> ur = usersdao.findById(user_id);
				
		if(ur.isEmpty()) {
		return ResponseEntity.notFound().build();
		}else
		mesurementservice.updateMesurements(m);
		return ResponseEntity.ok("modified successfully");
			
		}
		
		//ADMIN CAN GET USERS BY SUBSCRIPTION
		@GetMapping("/getUsersBySubscription/{subscription_id}")
		public ResponseEntity<Optional<List<users>>> getUsersBySubscription(@PathVariable int subscription_id){
			Optional<List<users>> uslist=usersservice.getUsersBySubscription(subscription_id);
			if(uslist!=null)
				//return successful return
				return ResponseEntity.ok(uslist);
			else
				//returns the message that the data not found
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
}
