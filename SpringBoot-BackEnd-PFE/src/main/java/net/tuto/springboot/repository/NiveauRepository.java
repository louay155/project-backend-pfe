package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Niveau;

@Repository
public interface NiveauRepository  extends JpaRepository<Niveau,Long> {

}
