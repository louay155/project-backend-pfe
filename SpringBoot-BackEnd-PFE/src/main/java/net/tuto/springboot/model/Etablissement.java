package net.tuto.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Etablissement")
public class Etablissement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_etab ;
	@Column(name="Nom_etablissement")
private String Nom_etab;
	@Column(name="adresse")
private String adresse;
@OneToMany(mappedBy="etab")
private List<Eleve>leleve;
public Etablissement() {}
public Etablissement(String nom_etab, String adresse) {
	super();
	Nom_etab = nom_etab;
	this.adresse = adresse;
}
public long getId_etab() {
	return id_etab;
}
public void setId_etab(long id_etab) {
	this.id_etab = id_etab;
}
public String getNom_etab() {
	return Nom_etab;
}
public void setNom_etab(String nom_etab) {
	Nom_etab = nom_etab;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

}
