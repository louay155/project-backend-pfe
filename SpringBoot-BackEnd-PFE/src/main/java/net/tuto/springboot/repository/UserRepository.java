package net.tuto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tuto.springboot.model.User;
@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
