package com.everis.cad.micro.functionalityA.controller;

import com.everis.cad.micro.functionalityA.dto.EntityADto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/entityA")
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
