package com.everis.cad.micro.service;

import com.everis.cad.micro.commons.AbstractJpaRepositoryManagerImpl;
import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.domain.EntityA;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import com.everis.cad.micro.mapper.EntityAMapper;
import com.everis.cad.micro.repository.EntityARepository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityAService extends AbstractJpaRepositoryManagerImpl<EntityA, EntityADto, Integer> implements Manager<EntityADto, Integer> {

	private final EntityARepository repository;
	private final EntityAMapper mapper;

	@Override
	protected JpaRepository<EntityA, Integer> getRepository() {
		return this.repository;
	}

	@Override
	protected EntityMapper<EntityA, EntityADto> getMapper() {
		return this.mapper;
	}

}
