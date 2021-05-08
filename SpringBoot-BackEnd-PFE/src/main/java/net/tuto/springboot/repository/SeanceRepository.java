package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Seance;
@Repository
public interface SeanceRepository  extends JpaRepository<Seance,Long>  {

}
