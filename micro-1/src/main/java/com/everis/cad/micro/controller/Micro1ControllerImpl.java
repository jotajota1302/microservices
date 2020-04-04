package com.everis.cad.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.dto.Micro1Dto;
import com.everis.cad.micro.service.Micro1Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/entity")
@RequiredArgsConstructor
public class Micro1ControllerImpl extends AbstractMicroserviceController<Micro1Dto, Integer> implements Micro1Controller {

    private final Micro1Service microService;

	@Override
	protected Manager<Micro1Dto, Integer> getManager() {
		return this.microService;
	}

}
