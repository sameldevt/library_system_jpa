package com.samueldev.library_system.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samueldev.library_system.entities.Publisher;
import com.samueldev.library_system.services.PublisherService;

@RestController
@RequestMapping(value = "/publishers")
public class PublisherResources {

	@Autowired
	private PublisherService service;
	
	@GetMapping
	public ResponseEntity<List<Publisher>> findAll(){
		List<Publisher> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Publisher> findById(@PathVariable Long id){
		Publisher obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
