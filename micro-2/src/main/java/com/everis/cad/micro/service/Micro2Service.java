package com.everis.cad.micro.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.cad.micro.commons.AbstractJpaRepositoryManagerImpl;
import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.domain.Micro2Entity;
import com.everis.cad.micro.dto.Micro2Dto;
import com.everis.cad.micro.mapper.Micro2Mapper;
import com.everis.cad.micro.repository.Micro2Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Micro2Service extends AbstractJpaRepositoryManagerImpl<Micro2Entity, Micro2Dto, Integer> implements Manager<Micro2Dto, Integer> {

	private final Micro2Repository repository;
	private final Micro2Mapper mapper;

	@Override
	protected JpaRepository<Micro2Entity, Integer> getRepository() {
		return this.repository;
	}

	@Override
	protected EntityMapper<Micro2Entity, Micro2Dto> getMapper() {
		return this.mapper;
	}

}
