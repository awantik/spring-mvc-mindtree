package com.skillspeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView getPage(){
		String message ="<h1>Hello World</h1>";
		//Student s = new 
		
		return new ModelAndView("home","message",message);
	}
	
	@RequestMapping("/contactus")
	public ModelAndView getContactUSPage(){
		String message ="<h1>Contact Us</h1>";
		
		return new ModelAndView("home","message",message);
	}

}
