package com.everis.cad.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.domain.Micro1Entity;

@Repository
public interface Micro1Repository extends JpaRepository<Micro1Entity, Integer> {
}
