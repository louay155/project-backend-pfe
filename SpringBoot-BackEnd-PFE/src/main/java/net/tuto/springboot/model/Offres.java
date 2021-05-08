package net.tuto.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offres")
public class Offres {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_off;
public Offres() {}
public long getId_off() {
	return id_off;
}

public void setId_off(long id_off) {
	this.id_off = id_off;
}

}
