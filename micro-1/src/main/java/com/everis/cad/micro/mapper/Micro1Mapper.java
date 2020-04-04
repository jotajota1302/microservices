package com.everis.cad.micro.mapper;

import org.mapstruct.Mapper;

import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.domain.Micro1Entity;
import com.everis.cad.micro.dto.Micro1Dto;

@Mapper
public interface Micro1Mapper extends EntityMapper<Micro1Entity, Micro1Dto> {
}
