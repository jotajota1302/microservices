package com.everis.cad.micro.functionalityA.repository;

import com.everis.cad.micro.functionalityA.domain.EntityA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityARepository extends JpaRepository<EntityA, Integer> {
}
