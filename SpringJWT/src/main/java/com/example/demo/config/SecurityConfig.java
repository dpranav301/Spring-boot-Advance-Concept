package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import com.example.demo.security.JWTAuthenticationEntryPoint;
import com.example.demo.security.JWTAuthenticationFilter;

@Component
@Configuration
public class SecurityConfig {

	@Autowired
	private JWTAuthenticationEntryPoint point;
	@Autowired
	private JWTAuthenticationFilter filter;
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf->csrf.disable())
			.cors(cors->cors.disable())
			.authorizeHttpRequests(auth->auth.requestMatchers("/home/**").authenticated()
			.requestMatchers("/auth/login").permitAll().anyRequest().authenticated())
			.exceptionHandling(exp->exp.authenticationEntryPoint(point))
			.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
	}
}
