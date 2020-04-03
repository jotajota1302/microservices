package com.everis.cad.micro.functionalityB.controller;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.functionalityA.controller.EntityAController;
import com.everis.cad.micro.functionalityA.dto.EntityADto;
import com.everis.cad.micro.functionalityB.dto.EntityBDto;
import com.everis.cad.micro.functionalityB.service.EntityBService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EntityBControllerImpl extends AbstractMicroserviceController<EntityBDto, Integer> implements EntityBController {

	private final EntityBService service;
	private final EntityAController.Feign feign;

    @GetMapping(value = "/entityA/{id}")
    public ResponseEntity<EntityADto> findEntityA(@PathVariable Integer id) {
        return feign.find(id);
    }

	@Override
	protected Manager<EntityBDto, Integer> getManager() {
		return service;
	}

}
