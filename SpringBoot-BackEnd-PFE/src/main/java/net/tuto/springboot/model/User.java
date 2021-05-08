package net.tuto.springboot.model;

import java.util.Date;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
/*@Entity
@Table(name="Users")*/
public  abstract class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	//@Column(name="nom")
	private String nom;
	
	//@Column(name="prenom")
	private String prenom;
	
	//@Column(name="adresse")
	private String adresse;
	
	//@Column(name="email")
	private String Email;
	
	//@Column(name="date_naiss")
	private Date date_naiss;
	
	//@Column(name="mdp")
	private String mdp;
	
	
	
	public User() {}
	public User(String nom, String prenom, String adresse, String email, Date date_naiss, String mdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		Email = email;
		this.date_naiss = date_naiss;
		this.mdp = mdp;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
