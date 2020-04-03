package com.everis.cad.micro.commons;

import java.util.List;

public interface Manager<DTO, ID> {

    List<DTO> findAll();

    DTO findById(final ID id);

    Iterable<DTO> findByIds(final List<ID> id);

    DTO create(DTO e);

    DTO update(ID id, DTO e);

    List<DTO> create(final List<DTO> es);

    void remove(final ID id);

    void remove(final List<ID> id);

}
