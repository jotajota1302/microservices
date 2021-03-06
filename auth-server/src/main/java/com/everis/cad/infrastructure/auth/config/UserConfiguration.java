package com.everis.cad.infrastructure.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration
		extends GlobalAuthenticationConfigurerAdapter
{
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void init ( AuthenticationManagerBuilder auth ) throws Exception
	{

		auth.inMemoryAuthentication ( ).withUser ( "admin").password ( passwordEncoder.encode ("admin" )).roles ( "ADMIN","USER").authorities ( "CAN_READ","CAN_WRITE").
		and ( ).withUser ( "username").password ( passwordEncoder.encode ("password") ).roles ( "USER").authorities ( "CAN_READ");
	}

}
