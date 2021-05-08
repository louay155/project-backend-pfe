package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Eleve;

@Repository
public interface EleveRepository extends JpaRepository<Eleve,Long> {

}
