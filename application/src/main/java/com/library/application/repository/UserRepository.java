package com.library.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.application.module.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsernameAndPassword(String username, String  password);
}
