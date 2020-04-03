package com.everis.cad.micro.functionalityB.controller;

import com.everis.cad.micro.functionalityB.dto.EntityBDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/entityB")
public interface EntityBController {

    @GetMapping
    ResponseEntity<List<EntityBDto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<EntityBDto> find(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<EntityBDto> create(@RequestBody EntityBDto dto);

    @PutMapping(value = "/{id}")
    ResponseEntity<EntityBDto> update(@PathVariable Integer id, @RequestBody EntityBDto dto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id);

    @FeignClient("micro-entity-B")
    interface Feign extends EntityBController {
    }

}
