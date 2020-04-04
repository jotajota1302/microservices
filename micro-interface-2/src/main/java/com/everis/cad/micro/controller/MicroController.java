package com.everis.cad.micro.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.everis.cad.micro.dto.MicroDto;

import java.util.List;

public interface MicroController {

    @GetMapping
    ResponseEntity<List<MicroDto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<MicroDto> find(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<MicroDto> create(@RequestBody MicroDto dto);

    @PutMapping(value = "/{id}")
    ResponseEntity<MicroDto> update(@PathVariable Integer id, @RequestBody MicroDto dto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id);

    @FeignClient("micro-entity-a")
    interface Feign extends MicroController {
    }

}
