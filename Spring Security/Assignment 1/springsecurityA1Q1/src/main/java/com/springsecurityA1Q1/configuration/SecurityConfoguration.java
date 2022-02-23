package com.springsecurityA1Q1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfoguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		// Set your configuration on the auth object
		auth.inMemoryAuthentication()
		.withUser("hello")
		.password("hello")
		.roles("HELLO")
		.and() //used to add multiple user
		.withUser("admin")
		.password("admin")
		.roles("ADMIN");
				
	}
	//used for PasswordEncoder
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	//For Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/hello").hasRole("HELLO")
		.and().formLogin();
		
		
	}
}
