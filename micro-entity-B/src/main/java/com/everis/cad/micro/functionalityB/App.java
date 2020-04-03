package com.everis.cad.micro.functionalityB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.everis.cad.micro.commons.config.SecurityConfiguration;
import com.everis.cad.micro.commons.config.SwaggerConfig;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.everis.cad.micro"})
@EntityScan(basePackages = {"com.everis.cad"})
@Import({SecurityConfiguration.class, SwaggerConfig.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
