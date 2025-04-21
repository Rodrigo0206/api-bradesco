package com.rodrigo.api_bradesco.repositories;

import com.rodrigo.api_bradesco.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}