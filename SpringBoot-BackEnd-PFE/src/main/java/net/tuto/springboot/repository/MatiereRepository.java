package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Matiere;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere,Long> {

}
