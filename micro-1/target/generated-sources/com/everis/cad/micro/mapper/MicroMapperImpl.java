package com.everis.cad.micro.mapper;

import com.everis.cad.micro.domain.MicroEntity;
import com.everis.cad.micro.dto.MicroDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-04T21:00:45+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_242 (AdoptOpenJDK)"
)
@Component
public class MicroMapperImpl implements MicroMapper {

    @Override
    public MicroDto entityToModel(MicroEntity e) {
        if ( e == null ) {
            return null;
        }

        MicroDto microDto = new MicroDto();

        microDto.setId( e.getId() );
        microDto.setAttribute1( e.getAttribute1() );
        microDto.setAttribute2( e.getAttribute2() );
        microDto.setCreatedDate( e.getCreatedDate() );
        microDto.setModifiedDate( e.getModifiedDate() );

        return microDto;
    }

    @Override
    public List<MicroDto> entitiesToModels(List<MicroEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<MicroDto> list = new ArrayList<MicroDto>( e.size() );
        for ( MicroEntity microEntity : e ) {
            list.add( entityToModel( microEntity ) );
        }

        return list;
    }

    @Override
    public List<MicroDto> entitiesToModels(Iterable<MicroEntity> e) {
        if ( e == null ) {
            return null;
        }

        List<MicroDto> list = new ArrayList<MicroDto>();
        for ( MicroEntity microEntity : e ) {
            list.add( entityToModel( microEntity ) );
        }

        return list;
    }

    @Override
    public MicroEntity modelToEntity(MicroDto m) {
        if ( m == null ) {
            return null;
        }

        MicroEntity microEntity = new MicroEntity();

        if ( m.getId() != null ) {
            microEntity.setId( m.getId() );
        }
        microEntity.setAttribute1( m.getAttribute1() );
        microEntity.setAttribute2( m.getAttribute2() );
        microEntity.setCreatedDate( m.getCreatedDate() );
        microEntity.setModifiedDate( m.getModifiedDate() );

        return microEntity;
    }

    @Override
    public List<MicroEntity> modelsToEntities(List<MicroDto> m) {
        if ( m == null ) {
            return null;
        }

        List<MicroEntity> list = new ArrayList<MicroEntity>( m.size() );
        for ( MicroDto microDto : m ) {
            list.add( modelToEntity( microDto ) );
        }

        return list;
    }

    @Override
    public List<MicroEntity> modelsToEntities(Iterable<MicroDto> m) {
        if ( m == null ) {
            return null;
        }

        List<MicroEntity> list = new ArrayList<MicroEntity>();
        for ( MicroDto microDto : m ) {
            list.add( modelToEntity( microDto ) );
        }

        return list;
    }
}
