package com.everis.cad.micro.functionalityB.mapper;

import com.everis.cad.micro.commons.EntityMapper;
import com.everis.cad.micro.functionalityB.domain.EntityB;
import com.everis.cad.micro.functionalityB.dto.EntityBDto;
import org.mapstruct.Mapper;

@Mapper
public interface EntityBMapper extends EntityMapper<EntityB, EntityBDto> {
}
