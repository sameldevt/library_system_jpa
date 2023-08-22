package com.samueldev.library_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.library_system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
