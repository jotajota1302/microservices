package com.everis.cad.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.dto.MicroDto;
import com.everis.cad.micro.service.MicroService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/entity")
@RequiredArgsConstructor
public class MicroControllerImpl extends AbstractMicroserviceController<MicroDto, Integer> implements MicroController {

    private final MicroService microService;

	@Override
	protected Manager<MicroDto, Integer> getManager() {
		return this.microService;
	}

}
