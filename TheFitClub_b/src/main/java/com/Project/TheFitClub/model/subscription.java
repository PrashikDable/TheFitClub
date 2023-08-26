package com.Project.TheFitClub.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class subscription {
	@Id
	private int subscription_id;
	private String sname;
	private float price;

	@OneToMany(mappedBy="subscription")
	@JsonIgnore
	private List<subsDetails> subsDetails;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainer_id")
	private trainer trainer;
	
	@OneToMany(mappedBy="subscription")
	@JsonIgnore
	private List<users> userslist;

	public subscription() {
		super();
	}

	public subscription(int subscription_id, String sname, float price,
			List<com.Project.TheFitClub.model.subsDetails> subsDetails, com.Project.TheFitClub.model.trainer trainer,
			List<users> userslist) {
		super();
		this.subscription_id = subscription_id;
		this.sname = sname;
		this.price = price;
		this.subsDetails = subsDetails;
		this.trainer = trainer;
		this.userslist = userslist;
	}

	public int getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(int subscription_id) {
		this.subscription_id = subscription_id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<subsDetails> getSubsDetails() {
		return subsDetails;
	}

	public void setSubsDetails(List<subsDetails> subsDetails) {
		this.subsDetails = subsDetails;
	}

	public trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(trainer trainer) {
		this.trainer = trainer;
	}

	public List<users> getUserslist() {
		return userslist;
	}

	public void setUserslist(List<users> userslist) {
		this.userslist = userslist;
	}

	@Override
	public String toString() {
		return "subscription [subscription_id=" + subscription_id + ", sname=" + sname + ", price=" + price
				+ ", subsDetails=" + subsDetails + ", trainer=" + trainer + ", userslist=" + userslist + "]";
	}

	
	
	
	
}
