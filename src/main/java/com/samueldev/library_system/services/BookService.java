package com.samueldev.library_system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.library_system.entities.Book;
import com.samueldev.library_system.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	public BookRepository repository;
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public Book findById(Long id) {
		Optional<Book> obj = repository.findById(id);
		return obj.get();	
	}
}
