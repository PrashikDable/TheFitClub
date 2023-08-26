package com.Project.TheFitClub.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class diet_history {
		
	private int diet_id;
	private float quantity;
	private int nutrition_id;
	@Id
	private LocalDate dDate;
	
	public diet_history() {
		super();
	}

	public diet_history(int diet_id, float quantity, int nutrition_id, LocalDate dDate) {
		super();
		this.diet_id = diet_id;
		this.quantity = quantity;
		this.nutrition_id = nutrition_id;
		this.dDate = dDate;
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

	public int getNutrition_id() {
		return nutrition_id;
	}

	public void setNutrition_id(int nutrition_id) {
		this.nutrition_id = nutrition_id;
	}

	public LocalDate getdDate() {
		return dDate;
	}

	public void setdDate(LocalDate dDate) {
		this.dDate = dDate;
	}

	@Override
	public String toString() {
		return "diet_history [diet_id=" + diet_id + ", quantity=" + quantity + ", nutrition_id=" + nutrition_id
				+ ", dDate=" + dDate + "]";
	}
	
	
	
}
