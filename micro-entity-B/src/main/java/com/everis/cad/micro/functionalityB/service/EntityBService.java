package com.everis.cad.micro.functionalityB.service;

import com.everis.cad.micro.commons.AbstractJpaRepositoryManagerImpl;
import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.functionalityB.domain.EntityB;
import com.everis.cad.micro.functionalityB.dto.EntityBDto;
import com.everis.cad.micro.functionalityB.mapper.EntityBMapper;
import com.everis.cad.micro.functionalityB.repository.EntityBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EntityBService extends AbstractJpaRepositoryManagerImpl<EntityB, EntityBDto, Integer> implements Manager<EntityBDto, Integer> {

	private final EntityBRepository repository;
	private final EntityBMapper mapper;

	@Override
	protected JpaRepository<EntityB, Integer> getRepository() {
		return repository;
	}

	@Override
	protected EntityMapper<EntityB, EntityBDto> getMapper() {
		return mapper;
	}
}
