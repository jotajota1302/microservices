package com.everis.cad.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.domain.EntityA;

@Repository
public interface EntityARepository extends JpaRepository<EntityA, Integer> {
}
