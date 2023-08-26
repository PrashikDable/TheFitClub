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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.TheFitClub.dao.subsDetailsDao;
import com.Project.TheFitClub.dao.subscriptionDao;
import com.Project.TheFitClub.dao.trainerDao;
import com.Project.TheFitClub.model.certificates;
import com.Project.TheFitClub.model.subsDetails;
import com.Project.TheFitClub.model.subscription;
import com.Project.TheFitClub.model.trainer;
import com.Project.TheFitClub.model.users;
import com.Project.TheFitClub.service.certificateService;
import com.Project.TheFitClub.service.trainerService;
import com.Project.TheFitClub.service.usersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/trainer")
public class trainerController {

	@Autowired
	private trainerService trainerservice;
	
	@Autowired
	private certificateService certificateservice;
	
	@Autowired
	private trainerDao trainerdao;
	
	@Autowired
	private usersService usersservice;
	
	@Autowired
	private subscriptionDao subscriptiondao;
	
	@Autowired
	private subsDetailsDao subsdetailsdao;
	
	
	//ADMIN CAN FETCH ALL TRAINERS
	@GetMapping("/getTrainers")
	public List<trainer> getAllTrainers(){
		return trainerservice.findAll();
	}
	
	//ADMIN/USER FETCH TRAINER BY ID
	@GetMapping("/getTrainers/{trainer_id}")
	public ResponseEntity<Optional<trainer>> getTrainerById(@PathVariable int trainer_id){
		Optional<trainer> w = trainerservice.getById(trainer_id);
		
		if(w!=null)
			//return successful return
			return ResponseEntity.ok(w);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//ADMIN/USER FETCH TRAINER BY CATAGORY
		@GetMapping("/getTrainer/{specialization}")
		public ResponseEntity<String> getTrainerBySpeciality(@PathVariable String specialization){
			Optional<List<trainer>> t = trainerservice.getBySpecialization(specialization);
			
			if(t!=null)
				//return successful return
				return ResponseEntity.ok(specialization);
			else
				//returns the message that the data not found
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	
	
	
	//GET USERS BY TRAINER .... ADMIN CAN FETCH USERS BY TRAINER
	@GetMapping("/getUsersByTrainer/{trainer_id}")
	public ResponseEntity<Optional<List<users>>> getUsersByTrainer(@PathVariable int trainer_id){
		Optional <List<users>> w = java.util.Optional.empty();
		try {
			w = usersservice.getUserByTrainer(trainer_id);
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
	
	//TRAINER REGISTRAION
	@PostMapping("/addTrainer")
	public ResponseEntity<String> createTrainer(@RequestBody trainer t){
		trainerservice.addTrainer(t);
		return ResponseEntity.ok("Added Successfully");
		
	}	
	//TRAINER CAN ADD CERTIFICATES
	@PostMapping("/certificate/{trainer_id}")
	public ResponseEntity<String> addCertificate(@RequestParam("trainer_id")int trainer_id, @RequestBody certificates c){
		Optional<trainer> t = trainerdao.findById(trainer_id);
		
		if(t.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else
		
		certificateservice.addCertificate(c);
		return ResponseEntity.ok("Added Successfully");
		
	}
	//update profile of trainer using this
	@PutMapping("/updateTrainer/{trainer_id}")
	public ResponseEntity<String> updateDiet(@PathVariable("trainer_id") int trainer_id, @RequestBody trainer t){
		Optional<trainer> tr = trainerdao.findById(trainer_id);
		
		if(tr.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else
			trainerservice.updateTrainer(t);
			return ResponseEntity.ok("modified successfully");
		
	}
	//GET ALL SUBCRIPTIONS
	@GetMapping("/getSubscription")
	public List<subscription> getAllSubscription(){
		return subscriptiondao.findAll();
	}
	//GET SUBSCRIPTION BY ID
	@GetMapping("/getSubscriptions/{subscription_id}")
	public ResponseEntity<Optional<subscription>> getSubscriptionById(@PathVariable int subscription_id){
		Optional<subscription> s = subscriptiondao.findById(subscription_id);
		
		if(s!=null)
			//return successful return
			return ResponseEntity.ok(s);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	//GET SUBSCRIPTON DETAILS BY ID
	@GetMapping("/getSubscriptionDetails/{subscription_id}")
	public ResponseEntity<Optional<subsDetails>> getSubscriptionDetails(@PathVariable int subscription_id){
		Optional<subsDetails> s = subsdetailsdao.findById(subscription_id);
		
		if(s!=null)
			//return successful return
			return ResponseEntity.ok(s);
		else
			//returns the message that the data not found
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
}
