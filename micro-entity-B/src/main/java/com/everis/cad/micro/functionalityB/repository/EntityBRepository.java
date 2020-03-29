package com.everis.cad.micro.functionalityB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.functionalityB.domain.EntityB;

@Repository
public interface EntityBRepository extends JpaRepository<EntityB,Integer>{
		
	public Integer countByStringAttribute(String att);

}