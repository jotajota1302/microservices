package com.everis.cad.micro.entityB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.cad.micro.entityB.domain.EntityB;
import com.everis.cad.micro.entityB.repository.EntityBRepository;

@Service
public class EntityBService {

	@Autowired
	EntityBRepository repository;

	public void create(EntityB entity) {
		repository.save(entity);
	}

	public EntityB read(int id) {
		return repository.findById(id).get();
	}

	public List<EntityB> readAll() {
		return repository.findAll();
	}

	public void update(EntityB entity) {
		repository.save(entity);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
	
	

}
