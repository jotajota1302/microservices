package com.everis.cad.micro.functionalityA.mapper;

import com.everis.cad.micro.functionalityA.domain.EntityA;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T10:09:10+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.1 (Oracle Corporation)"
)
@Component
public class EntityAMapperImpl implements EntityAMapper {

    @Override
    public EntityADto entityToModel(EntityA arg0) {
        if ( arg0 == null ) {
            return null;
        }

        EntityADto entityADto = new EntityADto();

        entityADto.setAttribute1( arg0.getAttribute1() );
        entityADto.setAttribute2( arg0.getAttribute2() );
        entityADto.setCreatedDate( arg0.getCreatedDate() );
        entityADto.setModifiedDate( arg0.getModifiedDate() );

        return entityADto;
    }

    @Override
    public List<EntityADto> entitiesToModels(List<EntityA> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<EntityADto> list = new ArrayList<EntityADto>( arg0.size() );
        for ( EntityA entityA : arg0 ) {
            list.add( entityToModel( entityA ) );
        }

        return list;
    }

    @Override
    public List<EntityADto> entitiesToModels(Iterable<EntityA> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<EntityADto> list = new ArrayList<EntityADto>();
        for ( EntityA entityA : arg0 ) {
            list.add( entityToModel( entityA ) );
        }

        return list;
    }

    @Override
    public EntityA modelToEntity(EntityADto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        EntityA entityA = new EntityA();

        entityA.setAttribute1( arg0.getAttribute1() );
        entityA.setAttribute2( arg0.getAttribute2() );
        entityA.setCreatedDate( arg0.getCreatedDate() );
        entityA.setModifiedDate( arg0.getModifiedDate() );

        return entityA;
    }

    @Override
    public List<EntityA> modelsToEntities(List<EntityADto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<EntityA> list = new ArrayList<EntityA>( arg0.size() );
        for ( EntityADto entityADto : arg0 ) {
            list.add( modelToEntity( entityADto ) );
        }

        return list;
    }

    @Override
    public List<EntityA> modelsToEntities(Iterable<EntityADto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<EntityA> list = new ArrayList<EntityA>();
        for ( EntityADto entityADto : arg0 ) {
            list.add( modelToEntity( entityADto ) );
        }

        return list;
    }
}
