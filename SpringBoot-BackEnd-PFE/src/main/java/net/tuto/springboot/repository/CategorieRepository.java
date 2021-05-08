package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Categorie;
@Repository
public interface CategorieRepository  extends JpaRepository<Categorie,Long> {

}
