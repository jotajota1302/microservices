package com.everis.cad.micro.entityA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.cad.micro.entityA.domain.EntityA;
import com.everis.cad.micro.entityA.repository.EntityARepository;
import com.querydsl.core.types.Predicate;

@Service
public class EntityAService
{

	@Autowired
	EntityARepository repository;

	public void create ( EntityA entity )
	{
		repository.save ( entity );
	}

	public EntityA read ( int id )
	{
		return repository.findById ( id ).get ( );
	}

	public List<EntityA> readAll ( )
	{
		return repository.findAll ( );
	}

	public void update ( EntityA entity )
	{
		repository.save ( entity );
	}

	public void delete ( int id )
	{
		repository.deleteById ( id );
	}

	public List<EntityA> findByPredicate ( Predicate predicate )
	{		
		return ( List<EntityA> ) repository.findAll ( predicate );
	}

}
