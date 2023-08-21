package com.Project.TheFitClub.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String name;
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

	public users() {
		super();
	}

	public users(int user_id, String name, LocalDate dOB, String gender, String email, String phoneNo, String city,
			String country, int isActive, String fitnessGoal, float weight, String dietPreference,
			com.Project.TheFitClub.model.login login) {
		super();
		this.user_id = user_id;
		this.name = name;
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
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "users [user_id=" + user_id + ", name=" + name + ", DOB=" + DOB + ", gender=" + gender + ", email="
				+ email + ", phoneNo=" + phoneNo + ", city=" + city + ", country=" + country + ", isActive=" + isActive
				+ ", fitnessGoal=" + fitnessGoal + ", weight=" + weight + ", dietPreference=" + dietPreference
				+ ", login=" + login + "]";
	}	
	
	
	
	
}
