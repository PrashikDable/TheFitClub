package com.Project.TheFitClub.model;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class certificates {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int certificate_id;
		private String name;
		private byte[] certificate_img;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="trainer_id")
		private trainer trainer;

		public certificates() {
			super();
		}

		public certificates(int certificate_id, String name, byte[] certificate_img,
				com.Project.TheFitClub.model.trainer trainer) {
			super();
			this.certificate_id = certificate_id;
			this.name = name;
			this.certificate_img = certificate_img;
			this.trainer = trainer;
		}

		public int getCertificate_id() {
			return certificate_id;
		}

		public void setCertificate_id(int certificate_id) {
			this.certificate_id = certificate_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public byte[] getCertificate_img() {
			return certificate_img;
		}

		public void setCertificate_img(byte[] certificate_img) {
			this.certificate_img = certificate_img;
		}

		public trainer getTrainer() {
			return trainer;
		}

		public void setTrainer(trainer trainer) {
			this.trainer = trainer;
		}

		@Override
		public String toString() {
			return "certificates [certificate_id=" + certificate_id + ", name=" + name + ", certificate_img="
					+ Arrays.toString(certificate_img) + ", trainer=" + trainer + "]";
		}
		
		
}
