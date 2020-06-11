package com.myapp.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {  	

	@RequestMapping(value={"/"} )
	    public String login() {	        
	        return "login";
	    }

	@RequestMapping(value={"/"} )
	    public String login(Model model) {
	        model.addAttribute("message", "Hello Reader !!");
	        return "index";
	    }
	 	     
	  @PostMapping("/home")
	    public String home(Model model) {	 
		   model.addAttribute("message", "you are in home page !!");
	       return "home";
	    }
	     
 
 
}
