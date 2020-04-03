package com.everis.cad.micro.functionalityA.controller;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import com.everis.cad.micro.functionalityA.service.EntityAService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class EntityAControllerImpl extends AbstractMicroserviceController<EntityADto, Integer> implements EntityAController {

    private final EntityAService entityAService;

	@Override
	protected Manager<EntityADto, Integer> getManager() {
		return this.entityAService;
	}

}
