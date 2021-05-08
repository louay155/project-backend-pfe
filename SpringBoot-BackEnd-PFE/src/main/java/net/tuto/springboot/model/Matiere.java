package net.tuto.springboot.model;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Matiere")
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_mat;
	@Column(name="libelle")
	private String libelle ;
	//Mapping eleve & matiere
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="eleve_matiere",
		joinColumns= @JoinColumn(name="id_mat"),
		inverseJoinColumns = @JoinColumn(name="id_elv")
		
			)	
	private Set<Eleve> leleve = new HashSet<>();
	//mapping Matiere & niveau
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="matiere_niveau",
			joinColumns= @JoinColumn(name="id_mat"),
			
					inverseJoinColumns = @JoinColumn(name="id_niv")
			)
	
	private List<Niveau> niveau;
	//mapping matiere & categorie
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="matiere_categorie",
			joinColumns= @JoinColumn(name="id_mat"),
			
					inverseJoinColumns = @JoinColumn(name="id_cat")
			)
	
	private List<Categorie> categorie;
	//mapping seance & professeurs
	@JsonIgnore
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="matiere")
	private Seance seance ;
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public void setLeleve(Set<Eleve> leleve) {
		this.leleve = leleve;
	}
	public Matiere() {}
	public Matiere(String libelle) {
		super();
		this.libelle = libelle;
	}
	public long getId_mat() {
		return id_mat;
	}
	public void setId_mat(long id_mat) {
		this.id_mat = id_mat;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Set<Eleve> getLeleve() {
		return leleve;
	}
	public List<Niveau> getNiveau() {
		return niveau;
	}
	public void setNiveau(List<Niveau> niveau) {
		this.niveau = niveau;
	}
	public List<Categorie> getCategorie() {
		return categorie;
	}
	public void setCategorie(List<Categorie> categorie) {
		this.categorie = categorie;
	}
	public static void professeur(Professeur professeur) {
		// TODO Auto-generated method stub
		//this.professeur=professeur;
	}
	public void leleve(Eleve eleve) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
