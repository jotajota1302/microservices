package com.everis.cad.micro.entityA.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.entityA.ConfigurationData;
import com.everis.cad.micro.entityA.domain.EntityA;
import com.everis.cad.micro.entityA.dto.EntityADto;
import com.everis.cad.micro.entityA.repository.EntityARepository;
import com.everis.cad.micro.entityA.service.EntityAService;
import com.querydsl.core.types.Predicate;

@RestController
@RequestMapping ( value = "/entityA" )
public class EntityAController
{

	@Autowired
	EntityAService service;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	ConfigurationData data;

	@GetMapping ( "/filter" )
	public ResponseEntity<List<EntityA>> getEntitiesByFilter (
			@QuerydslPredicate ( root = EntityA.class, bindings = EntityARepository.class ) Predicate predicate )
	{
		return ResponseEntity.ok ( service.findByPredicate ( predicate ) );
	}

	@GetMapping ( value = "/{id}" )
	public EntityADto find ( @PathVariable String id )
	{
		EntityA EntityA = service.read ( Integer.parseInt ( id ) );
		EntityADto entityADto = modelMapper.map ( EntityA, EntityADto.class );
		return entityADto;
	}

	@PostMapping
	public void createAndMap ( @RequestBody EntityADto dto )
	{
		EntityA entity = modelMapper.map ( dto, EntityA.class );
		service.create ( entity );
	}

	@PutMapping
	public void update ( @RequestBody EntityADto dto )
	{
		EntityA entity = modelMapper.map ( dto, EntityA.class );
		service.create ( entity );
	}

	@DeleteMapping ( value = "/{id}" )
	public void delete ( @PathVariable String id )
	{
		service.delete ( Integer.parseInt ( id ) );

	}

}
