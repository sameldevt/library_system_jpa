package com.samueldev.library_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.library_system.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
