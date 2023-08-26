package com.Project.TheFitClub.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class diet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diet_id;
	private float quantity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="nutrition_id")
	private nutrition nutrition;
	
	@ManyToMany(mappedBy="dietlist")
	private List<users> userslist;
	
	@ManyToMany(mappedBy="trainer_dietlist")
	private List<trainer> trainerlist;

	public diet() {
		super();
	}

	public diet(float quantity, com.Project.TheFitClub.model.nutrition nutrition, List<users> userslist,
			List<trainer> trainerlist) {
		super();
		this.quantity = quantity;
		this.nutrition = nutrition;
		this.userslist = userslist;
		this.trainerlist = trainerlist;
	}

	public int getDiet_id() {
		return diet_id;
	}

	public void setDiet_id(int diet_id) {
		this.diet_id = diet_id;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public nutrition getNutrition() {
		return nutrition;
	}

	public void setNutrition(nutrition nutrition) {
		this.nutrition = nutrition;
	}

	public List<users> getUserslist() {
		return userslist;
	}

	public void setUserslist(List<users> userslist) {
		this.userslist = userslist;
	}

	public List<trainer> getTrainerlist() {
		return trainerlist;
	}

	public void setTrainerlist(List<trainer> trainerlist) {
		this.trainerlist = trainerlist;
	}

	@Override
	public String toString() {
		return "diet [diet_id=" + diet_id + ", quantity=" + quantity + ", nutrition=" + nutrition + ", userslist="
				+ userslist + ", trainerlist=" + trainerlist + "]";
	}

	
	
	
	
	
}
