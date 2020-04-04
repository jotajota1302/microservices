package com.everis.cad.micro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.functionalityA.controller.EntityAController;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import com.everis.cad.micro.service.EntityAService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/entityA")
@RequiredArgsConstructor
public class EntityAControllerImpl extends AbstractMicroserviceController<EntityADto, Integer> implements EntityAController {

    private final EntityAService entityAService;

	@Override
	protected Manager<EntityADto, Integer> getManager() {
		return this.entityAService;
	}

}
