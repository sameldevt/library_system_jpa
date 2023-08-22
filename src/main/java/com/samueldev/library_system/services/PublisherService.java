package com.samueldev.library_system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.library_system.entities.Publisher;
import com.samueldev.library_system.repositories.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	private PublisherRepository repository;
	
	public List<Publisher> findAll(){
		return repository.findAll();
	}
	
	public Publisher findById(Long id) {
		Optional<Publisher> obj = repository.findById(id);
		return obj.get();
	}
}
