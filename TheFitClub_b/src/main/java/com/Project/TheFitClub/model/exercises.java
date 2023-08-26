package com.Project.TheFitClub.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class exercises {
	@Id
	private int exercise_id;
	private String muscle_group;
	private String exercise_name;
	private String level;
	private String push_pull;
	
	@OneToMany(mappedBy="exercises")
	@JsonIgnore
	private List<workout> workout;
	
	public exercises() {
		super();
	}

	public exercises(int exercise_id, String muscle_group, String exercise_name, String level, String push_pull,
			List<com.Project.TheFitClub.model.workout> workout) {
		super();
		this.exercise_id = exercise_id;
		this.muscle_group = muscle_group;
		this.exercise_name = exercise_name;
		this.level = level;
		this.push_pull = push_pull;
		this.workout = workout;
	}

	public int getExercise_id() {
		return exercise_id;
	}

	public String getMuscle_group() {
		return muscle_group;
	}

	public void setMuscle_group(String muscle_group) {
		this.muscle_group = muscle_group;
	}

	public String getExercise_name() {
		return exercise_name;
	}

	public void setExercise_name(String exercise_name) {
		this.exercise_name = exercise_name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPush_pull() {
		return push_pull;
	}

	public void setPush_pull(String push_pull) {
		this.push_pull = push_pull;
	}

	public List<workout> getWorkout() {
		return workout;
	}

	public void setWorkout(List<workout> workout) {
		this.workout = workout;
	}

	@Override
	public String toString() {
		return "exercises [exercise_id=" + exercise_id + ", muscle_group=" + muscle_group + ", exercise_name="
				+ exercise_name + ", level=" + level + ", push_pull=" + push_pull + ", workout=" + workout + "]";
	}

	
	
	
}
