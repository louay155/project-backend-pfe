package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.Admin;
@Repository
public interface AdminRepository  extends JpaRepository<Admin,Long> {

}
