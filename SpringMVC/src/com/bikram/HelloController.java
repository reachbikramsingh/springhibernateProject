package com.bikram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public ModelAndView display() {
		return new ModelAndView("display","message" , "This is display page");
		
	}
	@RequestMapping(value="/AboutUs",method=RequestMethod.GET)
	public String about() {
		return "AboutUs";
		
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("registrationPage","message" , "Please register here");
		
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("loginPage","message" , "Enter your details here");
		
	}
	@RequestMapping(value="/registerNewUser",method=RequestMethod.POST)
	public ModelAndView registerNewUser() {
		
		return new ModelAndView("loginPage","message" , "Enter your details here");
		
	}
	

}
