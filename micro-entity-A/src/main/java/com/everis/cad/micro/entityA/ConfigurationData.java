package com.everis.cad.micro.entityA;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("source")
public class ConfigurationData {	
	
	@Value("${data}")
	public String data;
	
}