package com.krista.counterassignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

@Controller


public class HomeController {
	int counter = 0;
	
	@RequestMapping("/")
	public String index(){
		counter++;
		return "index";
	}

	
	@RequestMapping("/counter")
	public String increase(HttpSession session){
		session.setAttribute("counter", counter);
		// you can set multiple session key:value pairs for the same session object
		System.out.println(session);
		//set what you want in your session "bucket"
		return "display";
	}
}

