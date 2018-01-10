package com.cnss.demo.controller;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DateController {
	
	@GetMapping("/gestionDate")
	public String afficherDate(Model model) {
		
		model.addAttribute("standardDate", new Date());
       /* model.addAttribute("localDateTime", LocalDate.now());
        model.addAttribute("localDate", LocalDate.now());
        model.addAttribute("timestamp", Instant.now());
		*/
		return "date";
	}

}
