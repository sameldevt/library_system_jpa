package com.samueldev.library_system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samueldev.library_system.entities.Book;
import com.samueldev.library_system.services.BookService;

@RestController
@RequestMapping(value = "/users")
public class BookResources {

	@Autowired
	private BookService service;
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		List<Book> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id){
		Book obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
