package com.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CrunchifyHelloWorld {
	 
	@RequestMapping(value="/showMessage",method=RequestMethod.GET)
	public ModelAndView helloWorld() {
 System.out.println("Hello");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		int i=0;
		return new ModelAndView("showMessage", "messege", message);
	
	}
}