package com.everis.cad.micro.mapper;

import org.mapstruct.Mapper;

import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.domain.MicroEntity;
import com.everis.cad.micro.dto.MicroDto;

@Mapper
public interface MicroMapper extends EntityMapper<MicroEntity, MicroDto> {
}
