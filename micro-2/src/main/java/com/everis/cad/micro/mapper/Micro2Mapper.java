package com.everis.cad.micro.mapper;

import org.mapstruct.Mapper;

import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.domain.Micro2Entity;
import com.everis.cad.micro.dto.Micro2Dto;

@Mapper
public interface Micro2Mapper extends EntityMapper<Micro2Entity, Micro2Dto> {
}
