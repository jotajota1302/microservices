package com.everis.cad.micro.functionalityB;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("source")
public class ConfigurationData {

}
