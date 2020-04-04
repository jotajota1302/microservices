package com.everis.cad.micro.controller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.everis.cad.micro.dto.Micro1Dto;

@FeignClient ( "micro-1" )
public interface FeignInterface
{
	@RequestMapping ( value = "/entity/{id}", method = RequestMethod.GET )
	Micro1Dto getEntityById ( @PathVariable String id );
}
