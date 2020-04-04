package com.everis.cad.micro.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.cad.micro.commons.AbstractJpaRepositoryManagerImpl;
import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.domain.MicroEntity;
import com.everis.cad.micro.dto.MicroDto;
import com.everis.cad.micro.mapper.MicroMapper;
import com.everis.cad.micro.repository.MicroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MicroService extends AbstractJpaRepositoryManagerImpl<MicroEntity, MicroDto, Integer> implements Manager<MicroDto, Integer> {

	private final MicroRepository repository;
	private final MicroMapper mapper;

	@Override
	protected JpaRepository<MicroEntity, Integer> getRepository() {
		return this.repository;
	}

	@Override
	protected EntityMapper<MicroEntity, MicroDto> getMapper() {
		return this.mapper;
	}

}
