package com.ankit.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class OauthLoginConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/","/home","/login").permitAll()
									.anyRequest().authenticated()
									.and().formLogin()
									.and().oauth2Login()	// we develop custom login form having hyper link to login FB
									.and().csrf().disable();
	}
}
