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
public class workout {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int workout_id;
		private int sets;
		private int repetations;
		private int rest;
		private int month;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="exercise_id")
		private exercises exercises;
		
		@ManyToMany(mappedBy="workoutlist")
		private List<users> usrlist;
		
		@ManyToMany(mappedBy="trainer_worklist")
		private List<trainer> trainlist;

		public workout() {
			super();
		}

		public workout(int sets, int repetations, int rest, int month, com.Project.TheFitClub.model.exercises exercises,
				List<users> usrlist, List<trainer> trainlist) {
			super();
			this.sets = sets;
			this.repetations = repetations;
			this.rest = rest;
			this.month = month;
			this.exercises = exercises;
			this.usrlist = usrlist;
			this.trainlist = trainlist;
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

		public exercises getExercises() {
			return exercises;
		}

		public void setExercises(exercises exercises) {
			this.exercises = exercises;
		}

		public List<users> getUsrlist() {
			return usrlist;
		}

		public void setUsrlist(List<users> usrlist) {
			this.usrlist = usrlist;
		}

		public List<trainer> getTrainlist() {
			return trainlist;
		}

		public void setTrainlist(List<trainer> trainlist) {
			this.trainlist = trainlist;
		}

		public int getWorkout_id() {
			return workout_id;
		}

		@Override
		public String toString() {
			return "workout [workout_id=" + workout_id + ", sets=" + sets + ", repetations=" + repetations + ", rest="
					+ rest + ", month=" + month + ", exercises=" + exercises + ", usrlist=" + usrlist + ", trainlist="
					+ trainlist + "]";
		}

		

		
		
		
		
		
}
