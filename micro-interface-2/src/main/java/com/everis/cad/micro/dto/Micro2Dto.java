package com.everis.cad.micro.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class Micro2Dto {
	
	private Integer id;
	
	private String attribute1;
 
    private long createdDate;
 
    private long modifiedDate;     
	
}
