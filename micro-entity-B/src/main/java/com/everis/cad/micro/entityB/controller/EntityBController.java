package com.everis.cad.micro.entityB.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.entityB.domain.EntityB;
import com.everis.cad.micro.entityB.dto.EntityADto;
import com.everis.cad.micro.entityB.dto.EntityBDto;
import com.everis.cad.micro.entityB.service.EntityBService;

@RestController
@RequestMapping ( value = "/entityB" )
public class EntityBController
{

	@Autowired
	EntityBService service;

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	EntityAFeignInterface feign;

	@GetMapping ( value = "/{id}" )
	public EntityBDto find ( @PathVariable String id )
	{
		EntityB entity = service.read ( Integer.parseInt ( id ) );
		EntityBDto entityDto = modelMapper.map ( entity, EntityBDto.class );
		return entityDto;
	}

	@GetMapping ( value = "/entityA/{id}" )
	public EntityADto findEntityA ( @PathVariable String id )
	{
		return feign.getEntityById ( id );
	}

	@PostMapping
	public void createAndMap ( @RequestBody EntityBDto dto )
	{
		EntityB entity = modelMapper.map ( dto, EntityB.class );
		service.create ( entity );
	}

	@PutMapping
	public void update ( @RequestBody EntityBDto dto )
	{
		EntityB entity = modelMapper.map ( dto, EntityB.class );
		service.create ( entity );
	}

	@DeleteMapping ( value = "/{id}" )
	public void delete ( @PathVariable String id )
	{
		service.delete ( Integer.parseInt ( id ) );

	}

}
