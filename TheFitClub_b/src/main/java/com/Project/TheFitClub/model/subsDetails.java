package com.Project.TheFitClub.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class subsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subsDetails_id;
	private String detail;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="subscription_id")
	private subscription subscription;

	public subsDetails() {
		super();
	}

	public subsDetails(String detail, com.Project.TheFitClub.model.subscription subscription) {
		super();
		this.detail = detail;
		this.subscription = subscription;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(subscription subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "subsDetails [detail=" + detail + ", subscription=" + subscription + "]";
	}
	
	
	
}
