package com.everis.cad.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.domain.Micro2Entity;

@Repository
public interface Micro2Repository extends JpaRepository<Micro2Entity, Integer> {
}
