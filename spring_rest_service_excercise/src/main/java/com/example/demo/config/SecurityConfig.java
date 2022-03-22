package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSrc;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSrc)
		.usersByUsernameQuery("select username,passwords,enabled from abd_users where username=?")
		.authoritiesByUsernameQuery("select u.username,a.authority from abd_authorities a,"
		+ "abd_users u where u.username=? and u.username=a.username")
		.passwordEncoder(encoder);
		
		
//		auth.jdbcAuthentication().withUser("india").password(encoder.encode("india"))
//						.roles("ADMIN").and().withUser("nepal").password(encoder.encode("nepal")).roles("GUEST");
//		

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests().antMatchers("/api/v2/branches/**")
			.authenticated().and().csrf().disable().httpBasic();
	
	
//.permitAll().antMatchers("/api/v1/loans/**")
}
	}
