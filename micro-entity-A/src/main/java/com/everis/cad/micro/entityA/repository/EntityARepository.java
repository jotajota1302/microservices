package com.everis.cad.micro.entityA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.entityA.domain.EntityA;

@Repository
public interface EntityARepository extends JpaRepository<EntityA,Integer>{
		
	public Integer countByStringAttribute(String att);

}