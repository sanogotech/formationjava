package com.cnss.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String startHome(Authentication authentication){
		String name =authentication.getName();
		System.out.println("******authentication.getName() : " + name);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		System.out.println("******userDetails.getUsername() : " + userDetails.getUsername());
		
		System.out.println("****** userDetails.getAuthorities() : " + userDetails.getAuthorities());
		return "index";
	}

}
