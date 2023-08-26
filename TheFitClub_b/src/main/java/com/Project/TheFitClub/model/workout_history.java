package com.Project.TheFitClub.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class workout_history {
	
	private int workout_id;
	private int sets;
	private int repetations;
	private int rest;
	private int month;
	private int exercise_id;
	@Id
	private LocalDate wDate;
	public workout_history() {
		super();
	}
	public workout_history(int workout_id, int sets, int repetations, int rest, int month, int exercise_id,
			LocalDate wDate) {
		super();
		this.workout_id = workout_id;
		this.sets = sets;
		this.repetations = repetations;
		this.rest = rest;
		this.month = month;
		this.exercise_id = exercise_id;
		this.wDate = wDate;
	}
	public int getWorkout_id() {
		return workout_id;
	}
	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public int getRepetations() {
		return repetations;
	}
	public void setRepetations(int repetations) {
		this.repetations = repetations;
	}
	public int getRest() {
		return rest;
	}
	public void setRest(int rest) {
		this.rest = rest;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getExercise_id() {
		return exercise_id;
	}
	public void setExercise_id(int exercise_id) {
		this.exercise_id = exercise_id;
	}
	public LocalDate getwDate() {
		return wDate;
	}
	public void setwDate(LocalDate wDate) {
		this.wDate = wDate;
	}
	@Override
	public String toString() {
		return "workout_history [workout_id=" + workout_id + ", sets=" + sets + ", repetations=" + repetations
				+ ", rest=" + rest + ", month=" + month + ", exercise_id=" + exercise_id + ", wDate=" + wDate + "]";
	}
	
	
	
}
