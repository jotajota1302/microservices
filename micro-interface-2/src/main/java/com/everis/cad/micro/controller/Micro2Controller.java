package com.everis.cad.micro.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.everis.cad.micro.dto.Micro2Dto;

import java.util.List;

public interface Micro2Controller {

    @GetMapping
    ResponseEntity<List<Micro2Dto>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<Micro2Dto> find(@PathVariable Integer id);

    @PostMapping
    ResponseEntity<Micro2Dto> create(@RequestBody Micro2Dto dto);

    @PutMapping(value = "/{id}")
    ResponseEntity<Micro2Dto> update(@PathVariable Integer id, @RequestBody Micro2Dto dto);

    @DeleteMapping(value = "/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id);

    @FeignClient("micro-2")
    interface Feign extends Micro2Controller {
    }

}
