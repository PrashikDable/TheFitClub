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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainer_id;
	private String name;
	private byte[] profile_pic;
	private LocalDate DOB;
	private String gender;
	private String email;
	private String phoneNo;
	private String city;
	private String country;
	private int isActive;
	private String specialization;
	private int experience;
	private String bio;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="login_id")
	private login login;
	
	@OneToMany(mappedBy="trainer")
	@JsonIgnore
	private List<certificates> certificates;
	
	@OneToMany(mappedBy="trainer")
	@JsonIgnore
	private List<users> users;
	
	@OneToMany(mappedBy="trainer")
	@JsonIgnore
	private List<subscription> subscription;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "trainer_workout",
        joinColumns = @JoinColumn(name = "trainer_id"),
        inverseJoinColumns = @JoinColumn(name = "workout_id")
    )
	private List<workout> trainer_worklist;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "trainer_diet",
        joinColumns = @JoinColumn(name = "trainer_id"),
        inverseJoinColumns = @JoinColumn(name = "diet_id")
    )
	private List<diet> trainer_dietlist;
	
	public trainer() {
		super();
	}

	public trainer(String name, byte[] profile_pic, LocalDate dOB, String gender, String email, String phoneNo,
			String city, String country, int isActive, String specialization, int experience, String bio,
			com.Project.TheFitClub.model.login login, List<com.Project.TheFitClub.model.certificates> certificates,
			List<com.Project.TheFitClub.model.users> users,
			List<com.Project.TheFitClub.model.subscription> subscription, List<workout> trainer_worklist,
			List<diet> trainer_dietlist) {
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
		this.specialization = specialization;
		this.experience = experience;
		this.bio = bio;
		this.login = login;
		this.certificates = certificates;
		this.users = users;
		this.subscription = subscription;
		this.trainer_worklist = trainer_worklist;
		this.trainer_dietlist = trainer_dietlist;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public login getLogin() {
		return login;
	}

	public void setLogin(login login) {
		this.login = login;
	}

	public List<certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<certificates> certificates) {
		this.certificates = certificates;
	}

	public List<users> getUsers() {
		return users;
	}

	public void setUsers(List<users> users) {
		this.users = users;
	}

	public List<subscription> getSubscription() {
		return subscription;
	}

	public void setSubscription(List<subscription> subscription) {
		this.subscription = subscription;
	}

	public List<workout> getTrainer_worklist() {
		return trainer_worklist;
	}

	public void setTrainer_worklist(List<workout> trainer_worklist) {
		this.trainer_worklist = trainer_worklist;
	}

	public List<diet> getTrainer_dietlist() {
		return trainer_dietlist;
	}

	public void setTrainer_dietlist(List<diet> trainer_dietlist) {
		this.trainer_dietlist = trainer_dietlist;
	}

	public int getTrainer_id() {
		return trainer_id;
	}

	@Override
	public String toString() {
		return "trainer [trainer_id=" + trainer_id + ", name=" + name + ", profile_pic=" + Arrays.toString(profile_pic)
				+ ", DOB=" + DOB + ", gender=" + gender + ", email=" + email + ", phoneNo=" + phoneNo + ", city=" + city
				+ ", country=" + country + ", isActive=" + isActive + ", specialization=" + specialization
				+ ", experience=" + experience + ", bio=" + bio + ", login=" + login + ", certificates=" + certificates
				+ ", users=" + users + ", subscription=" + subscription + ", trainer_worklist=" + trainer_worklist
				+ ", trainer_dietlist=" + trainer_dietlist + "]";
	}

	
	

	

	
	
	
	
	
}
