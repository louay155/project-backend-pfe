package net.tuto.springboot.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Admin extends User {

	public Admin() {}
	public Admin(String nom, String prenom, String adresse, String email, Date date_naiss, String mdp) {
		super(nom, prenom, adresse, email, date_naiss, mdp);
		// TODO Auto-generated constructor stub
	}

}
