package com.everis.cad.micro.commons;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractMicroserviceController<DTO, ID> {

    public ResponseEntity<List<DTO>> findAll() {
        return ResponseEntity.ok(this.getManager().findAll());
    }

    public ResponseEntity<DTO> find(@PathVariable ID id){
        return ResponseEntity.ok(this.getManager().findById(id));
    }

    public ResponseEntity<DTO> create(@RequestBody DTO dto){
        return ResponseEntity.ok(this.getManager().create(dto));
    }

    public ResponseEntity<DTO> update(@PathVariable ID id, @RequestBody DTO dto){
        return ResponseEntity.ok(this.getManager().update(id, dto));
    }

    public ResponseEntity<Void> delete(@PathVariable ID id){
        this.getManager().remove(id);
        return ResponseEntity.accepted().build();
    }

    protected abstract Manager<DTO, ID> getManager();

}
