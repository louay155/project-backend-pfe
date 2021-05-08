package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Etablissement;

@Repository
public interface EtablissementRepository extends JpaRepository <Etablissement,Long> {

}
