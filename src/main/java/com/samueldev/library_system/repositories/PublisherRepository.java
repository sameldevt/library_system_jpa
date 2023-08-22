package com.samueldev.library_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.library_system.entities.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{

}
