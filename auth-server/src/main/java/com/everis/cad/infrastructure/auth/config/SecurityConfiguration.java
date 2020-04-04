package com.everis.cad.infrastructure.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfiguration
		extends GlobalMethodSecurityConfiguration
{

	@Bean
	public PasswordEncoder getBCryptPasswordEncoder ( )
	{
		return new BCryptPasswordEncoder ( );
	}

}
