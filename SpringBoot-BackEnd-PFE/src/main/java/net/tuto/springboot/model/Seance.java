package net.tuto.springboot.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Seance")
public class Seance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_sce;
	@Column(name="date_sceance")
	private Date date_sce;
	@Column(name="heure_deb")
	private String heure_deb;
	@Column(name="heure_fin")
	private String heure_fin;
	@Column(name="nbr_sce")
	private int nbr_sce;
	@Column(name="prix_sce")
	private float prix_sce;
	@Column(name="montant")
	private float montant ;
		//mapping seance & eleve
		@OneToMany(mappedBy="seance")
		private List<Eleve>leleve;
		//mapping Seance & matiere
		@JsonIgnore
		@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
		@JoinColumn(name="id_mat")
		private Matiere matiere;
		@JsonIgnore
		@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
		@JoinColumn(name="id_prof")
		private Professeur prof;
		public Seance() {}
	public Seance(Date date_sce, String heure_deb, String heure_fin, int nbr_sce, float prix_sce, float montant) {
		super();
		this.date_sce = date_sce;
		this.heure_deb = heure_deb;
		this.heure_fin = heure_fin;
		this.nbr_sce = nbr_sce;
		this.prix_sce = prix_sce;
		this.montant = montant;
	}
	public long getId_sce() {
		return id_sce;
	}
	public void setId_sce(long id_sce) {
		this.id_sce = id_sce;
	}
	public Date getDate_sce() {
		return date_sce;
	}
	public void setDate_sce(Date date_sce) {
		this.date_sce = date_sce;
	}
	public String getHeure_deb() {
		return heure_deb;
	}
	public void setHeure_deb(String heure_deb) {
		this.heure_deb = heure_deb;
	}
	public String getHeure_fin() {
		return heure_fin;
	}
	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
	}
	public int getNbr_sce() {
		return nbr_sce;
	}
	public void setNbr_sce(int nbr_sce) {
		this.nbr_sce = nbr_sce;
	}
	public float getPrix_sce() {
		return prix_sce;
	}
	public void setPrix_sce(float prix_sce) {
		this.prix_sce = prix_sce;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public List<Eleve> getLeleve() {
		return leleve;
	}
	public void setLeleve(List<Eleve> leleve) {
		this.leleve = leleve;
	}
	

}
