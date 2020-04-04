package com.everis.cad.micro.mapper;

import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.domain.EntityA;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import org.mapstruct.Mapper;

@Mapper
public interface EntityAMapper extends EntityMapper<EntityA, EntityADto> {
}
