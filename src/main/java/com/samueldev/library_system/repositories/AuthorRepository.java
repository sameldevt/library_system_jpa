package com.samueldev.library_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.library_system.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
