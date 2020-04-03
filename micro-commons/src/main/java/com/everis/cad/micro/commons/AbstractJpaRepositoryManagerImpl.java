package com.everis.cad.micro.commons;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractJpaRepositoryManagerImpl<ENT, DTO, ID> implements Manager<DTO, ID> {

    protected abstract JpaRepository<ENT, ID> getRepository();

    protected abstract EntityMapper<ENT, DTO> getMapper();

    @Override
    public List<DTO> findAll() {
        return this.getMapper().entitiesToModels(this.getRepository().findAll());
    }

    @Override
    public DTO findById(ID id) {
        return this.getMapper().entityToModel(this.getRepository().findById(id).orElseThrow(NullPointerException::new));
    }

    @Override
    public Iterable<DTO> findByIds(List<ID> ids) {
        return this.getMapper().entitiesToModels(this.getRepository().findAllById(ids));
    }

    @Override
    public DTO create(DTO dto) {
        return this.getMapper().entityToModel(this.getRepository().save(this.getMapper().modelToEntity(dto)));
    }

    @Override
    public DTO update(ID id, DTO dto) {
        this.getRepository().findById(id).orElseThrow(NullPointerException::new);
        return this.getMapper().entityToModel(this.getRepository().save(this.getMapper().modelToEntity(dto)));
    }

    @Override
    public List<DTO> create(List<DTO> dtos) {
        return this.getMapper().entitiesToModels(this.getRepository().saveAll(this.getMapper().modelsToEntities(dtos)));
    }

    @Override
    public void remove(ID id) {
        this.getRepository().deleteById(id);
    }

    @Override
    public void remove(List<ID> ids) {
        this.getRepository().deleteInBatch(this.getRepository().findAllById(ids));
    }

}
