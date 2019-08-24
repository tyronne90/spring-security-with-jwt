//package com.spring.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@SuppressWarnings("deprecation")
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	private static final String[] ROLE = {"ADMIN", "USER"};
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication()
//		.withUser("user")
//		.password("user")
//		.roles(ROLE[1])
//		.and()
//		.withUser("admin")
//		.password("admin")
//		.roles(ROLE[0]);
//	}
//	
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//		
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeRequests()
//		.antMatchers("/admin").hasRole(ROLE[0])
//		.antMatchers("/user").hasRole(ROLE[1])
//		.antMatchers("/any").hasAnyRole(ROLE[0], ROLE[1])
//		.antMatchers("/").permitAll()
//		.and().formLogin();
//	}
//}
