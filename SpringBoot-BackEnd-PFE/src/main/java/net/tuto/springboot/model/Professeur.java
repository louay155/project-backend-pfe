package net.tuto.springboot.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Professeur extends User {
	//private long id_prof;
	private String diplome;
	private float pourcentage ;
	private float prix_heure;
	private float montant;
	
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="prof")
	private Seance seance ;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(String nom, String prenom, String adresse, String email, Date date_naiss, String mdp) {
		super(nom, prenom, adresse, email, date_naiss, mdp);
		// TODO Auto-generated constructor stub
	}
	/*public long getId_prof() {
		return id_prof;
	}
	public void setId_prof(long id_prof) {
		this.id_prof = id_prof;
	}*/
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public float getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	public float getPrix_heure() {
		return prix_heure;
	}
	public void setPrix_heure(float prix_heure) {
		this.prix_heure = prix_heure;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	

}
