package com.everis.cad.micro.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonAutoDetect
public class EntityADto {
	
	private Integer id;
	
	private String attribute1;
	
	private String attribute2;	 
 
    private long createdDate;
 
    private long modifiedDate;     
	
}
