package com.Project.TheFitClub.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String name;
	private byte[] profile_pic;
	private LocalDate DOB;
	private String gender;
	private String email;
	private String phoneNo;
	private String city;
	private String country;
	private int isActive;
	private String fitnessGoal;
	private float weight;
	private String dietPreference;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="login_id")
	private login login;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_id")
	private trainer trainer;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "user_workout",
        joinColumns = @JoinColumn(name = "users_id"),
        inverseJoinColumns = @JoinColumn(name = "workout_id")
    )
	private List<workout> workoutlist;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "user_diet",
        joinColumns = @JoinColumn(name = "users_id"),
        inverseJoinColumns = @JoinColumn(name = "diet_id")
    )
	private List<diet> dietlist;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="subscription_id")
	private subscription subscription;

	public users() {
		super();
	}

	public users(String name, byte[] profile_pic, LocalDate dOB, String gender, String email, String phoneNo,
			String city, String country, int isActive, String fitnessGoal, float weight, String dietPreference,
			com.Project.TheFitClub.model.login login, com.Project.TheFitClub.model.trainer trainer,
			List<workout> workoutlist, List<diet> dietlist, com.Project.TheFitClub.model.subscription subscription) {
		super();
		this.name = name;
		this.profile_pic = profile_pic;
		DOB = dOB;
		this.gender = gender;
		this.email = email;
		this.phoneNo = phoneNo;
		this.city = city;
		this.country = country;
		this.isActive = isActive;
		this.fitnessGoal = fitnessGoal;
		this.weight = weight;
		this.dietPreference = dietPreference;
		this.login = login;
		this.trainer = trainer;
		this.workoutlist = workoutlist;
		this.dietlist = dietlist;
		this.subscription = subscription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(byte[] profile_pic) {
		this.profile_pic = profile_pic;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getFitnessGoal() {
		return fitnessGoal;
	}

	public void setFitnessGoal(String fitnessGoal) {
		this.fitnessGoal = fitnessGoal;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getDietPreference() {
		return dietPreference;
	}

	public void setDietPreference(String dietPreference) {
		this.dietPreference = dietPreference;
	}

	public login getLogin() {
		return login;
	}

	public void setLogin(login login) {
		this.login = login;
	}

	public trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(trainer trainer) {
		this.trainer = trainer;
	}

	public List<workout> getWorkoutlist() {
		return workoutlist;
	}

	public void setWorkoutlist(List<workout> workoutlist) {
		this.workoutlist = workoutlist;
	}

	public List<diet> getDietlist() {
		return dietlist;
	}

	public void setDietlist(List<diet> dietlist) {
		this.dietlist = dietlist;
	}

	public subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(subscription subscription) {
		this.subscription = subscription;
	}

	public int getUser_id() {
		return user_id;
	}

	@Override
	public String toString() {
		return "users [user_id=" + user_id + ", name=" + name + ", profile_pic=" + Arrays.toString(profile_pic)
				+ ", DOB=" + DOB + ", gender=" + gender + ", email=" + email + ", phoneNo=" + phoneNo + ", city=" + city
				+ ", country=" + country + ", isActive=" + isActive + ", fitnessGoal=" + fitnessGoal + ", weight="
				+ weight + ", dietPreference=" + dietPreference + ", login=" + login + ", trainer=" + trainer
				+ ", workoutlist=" + workoutlist + ", dietlist=" + dietlist + ", subscription=" + subscription + "]";
	}

	

	
	
}
