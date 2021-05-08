package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Professeur;
@Repository
public interface ProfesseurRepository  extends JpaRepository<Professeur,Long> {

}
