package com.everis.cad.micro.commons.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableResourceServer
@EnableOAuth2Client
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
        .httpBasic().disable()
        .authorizeRequests()
        .antMatchers("/**/**").permitAll()
        .antMatchers("/**/public/**").permitAll()
        .antMatchers("/**/*swagger-*/**").permitAll()
        .antMatchers("/**/v2/api-docs/**").permitAll()
        .antMatchers("/**/cockpit/**").permitAll()
        .antMatchers("/lib/**").permitAll()
        .antMatchers("/api/**").permitAll()
        .antMatchers("/app/admin/**").permitAll()
        .antMatchers("/stomp/**").permitAll()
        .antMatchers("/actuator/**").permitAll()
        .antMatchers("/console/**").permitAll()
        .anyRequest().authenticated();

    }


    
 
}