package com.everis.cad.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.cad.micro.commons.AbstractMicroserviceController;
import com.everis.cad.micro.commons.Manager;
import com.everis.cad.micro.controller.Micro2Controller;
import com.everis.cad.micro.controller.feign.FeignInterface;
import com.everis.cad.micro.dto.Micro1Dto;
import com.everis.cad.micro.dto.Micro2Dto;
import com.everis.cad.micro.service.Micro2Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/entity")
@RequiredArgsConstructor
@EnableFeignClients
public class Micro2ControllerImpl extends AbstractMicroserviceController<Micro2Dto, Integer> implements Micro2Controller {

    private final Micro2Service microService;
    
    @Autowired
    FeignInterface feign;
    
    @GetMapping ( value = "/entity/{id}" )
	public Micro1Dto findEntity( @PathVariable String id )	{		
		return feign.getEntityById ( id );
	}
        
	@Override
	protected Manager<Micro2Dto, Integer> getManager() {
		return this.microService;
	}

}
