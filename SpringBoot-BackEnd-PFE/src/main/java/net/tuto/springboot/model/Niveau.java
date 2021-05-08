package net.tuto.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="niveau")
public class Niveau {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_niv;
	@Column(name="libelle")
	private String libelle;
	
	//Mapping matiere & niveau
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="niveau")
	private List<Matiere> matiere;
	public Niveau() {}

	public Niveau(String libelle) {
	super();
	this.libelle = libelle;
	}

	public long getId_niv() {
		return id_niv;
	}

	public void setId_niv(long id_niv) {
		this.id_niv = id_niv;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Matiere> getMatiere() {
		return matiere;
	}

	public void setMatiere(List<Matiere> matiere) {
		this.matiere = matiere;
	}

	

}
