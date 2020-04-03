package com.everis.cad.micro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties ( "source" )
public class ConfigurationData
{

}
