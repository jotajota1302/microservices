package com.everis.cad.micro.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.everis.cad.micro.dto.EntityADto;

import java.util.List;

public interface EntityAController {

    @GetMapping
    ResponseEntity<List<EntityADto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<EntityADto> find(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<EntityADto> create(@RequestBody EntityADto dto);

    @PutMapping(value = "/{id}")
    ResponseEntity<EntityADto> update(@PathVariable Integer id, @RequestBody EntityADto dto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id);

    @FeignClient("micro-entity-a")
    interface Feign extends EntityAController {
    }

}
