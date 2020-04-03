package com.everis.cad.micro.functionalityB.repository;

import com.everis.cad.micro.functionalityB.domain.EntityB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityBRepository extends JpaRepository<EntityB, Integer> {

    Integer countByStringAttribute(String att);

}
