package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Offres;
@Repository
public interface OffreRepository  extends JpaRepository<Offres,Long> {

}
