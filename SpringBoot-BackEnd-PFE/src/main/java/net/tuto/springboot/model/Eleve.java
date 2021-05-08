package net.tuto.springboot.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Eleve extends User {
	//mapping matiere & eleve
	@ManyToMany(mappedBy="leleve")
	private Set<Matiere>lmatiere = new HashSet<>();
	//mapping seance & eleve
	@ManyToOne
	private Seance seance ;
	@ManyToOne
	private Etablissement etab;
	
	public Eleve() {}
	
	

	public Eleve(String nom, String prenom, String adresse, String email, Date date_naiss, String mdp) {
		super(nom, prenom, adresse, email, date_naiss, mdp);
		// TODO Auto-generated constructor stub
	}



	public Set<Matiere> getLmatiere() {
		return lmatiere;
	}



	public void setLmatiere(Set<Matiere> lmatiere) {
		this.lmatiere = lmatiere;
	}



	public Seance getSeance() {
		return seance;
	}



	public void setSeance(Seance seance) {
		this.seance = seance;
	}



	
}
