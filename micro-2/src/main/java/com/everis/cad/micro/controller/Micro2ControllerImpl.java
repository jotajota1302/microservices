package com.everis.cad.micro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.dto.Micro1Dto;
import com.everis.cad.micro.dto.Micro2Dto;
import com.everis.cad.micro.service.Micro2Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/entity")
@RequiredArgsConstructor
public class Micro2ControllerImpl extends AbstractMicroserviceController<Micro2Dto, Integer> implements Micro2Controller {

    private final Micro2Service microService;

    private final Micro1Controller.Feign feign;

    @GetMapping(value = "/entity/{id}")
    public ResponseEntity<Micro1Dto> findEntityA(@PathVariable Integer id) {
        return feign.find(id);
    }
    
	@Override
	protected Manager<Micro2Dto, Integer> getManager() {
		return this.microService;
	}

}
