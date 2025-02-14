package com.ankit.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthLoginController {

	@GetMapping("/home")
	public String showHome() {
		return "Hello, Welecom to home page of RedBus.com";
	}
	
	@GetMapping("/after")
	public String afterLoginPage() {
		return "Hello, SucessFully Logged Into RedBus.com";
	}
	
	@GetMapping("/user")
	public Authentication showUserDetails(Principal principal) {
		System.out.println("logged in details"+principal.getName());
		Authentication auth =SecurityContextHolder.getContext().getAuthentication();// gives more detail about logged user
		return auth;
	}
}
