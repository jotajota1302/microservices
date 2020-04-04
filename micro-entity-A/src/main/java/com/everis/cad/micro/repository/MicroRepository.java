package com.everis.cad.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.cad.micro.domain.MicroEntity;

@Repository
public interface MicroRepository extends JpaRepository<MicroEntity, Integer> {
}
