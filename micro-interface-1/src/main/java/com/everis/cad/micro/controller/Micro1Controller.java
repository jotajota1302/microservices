package com.everis.cad.micro.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.everis.cad.micro.dto.Micro1Dto;

import java.util.List;

public interface Micro1Controller {

    @GetMapping
    ResponseEntity<List<Micro1Dto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<Micro1Dto> find(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<Micro1Dto> create(@RequestBody Micro1Dto dto);

    @PutMapping(value = "/{id}")
    ResponseEntity<Micro1Dto> update(@PathVariable Integer id, @RequestBody Micro1Dto dto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id);

    @FeignClient("micro-1")
    interface Feign extends Micro1Controller {
    }

}
