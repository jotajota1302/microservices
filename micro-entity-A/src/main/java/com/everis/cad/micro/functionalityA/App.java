package com.everis.cad.micro.functionalityA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
@EnableDiscoveryClient
@EnableResourceServer
@EnableFeignClients(basePackages = {"com.everis.cad.micro"})
@EntityScan(basePackages = {"com.everis.cad"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
