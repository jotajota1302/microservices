package com.everis.cad.micro.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.cad.micro.commons.AbstractJpaRepositoryManagerImpl;
import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.domain.Micro1Entity;
import com.everis.cad.micro.dto.Micro1Dto;
import com.everis.cad.micro.mapper.Micro1Mapper;
import com.everis.cad.micro.repository.Micro1Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Micro1Service extends AbstractJpaRepositoryManagerImpl<Micro1Entity, Micro1Dto, Integer> implements Manager<Micro1Dto, Integer> {

	private final Micro1Repository repository;
	private final Micro1Mapper mapper;

	@Override
	protected JpaRepository<Micro1Entity, Integer> getRepository() {
		return this.repository;
	}

	@Override
	protected EntityMapper<Micro1Entity, Micro1Dto> getMapper() {
		return this.mapper;
	}

}
