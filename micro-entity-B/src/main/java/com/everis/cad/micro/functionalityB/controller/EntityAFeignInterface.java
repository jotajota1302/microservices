package com.everis.cad.micro.functionalityB.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.cad.micro.functionalityB.dto.EntityADto;

@FeignClient ( "micro-entity-a" )
interface EntityAFeignInterface
{
	@RequestMapping ( value = "/entityA/{id}", method = GET )
	EntityADto getEntityById ( @PathVariable String id );
}
