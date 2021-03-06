package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	
	/* ############################# User Management ####################################### */
	
	 
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView indexPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("homepage", "message", message);
		
	}
	 
	
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView homePage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("home", "message", message);
		
	}

	@RequestMapping(value = { "/about" }, method = RequestMethod.GET)
	public ModelAndView aboutPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("about", "message", message);
		
	}
	
	@RequestMapping(value = { "/member" }, method = RequestMethod.GET)
	public ModelAndView memberPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("member", "message", message);
		
	}
	@RequestMapping(value = { "/memberReg" }, method = RequestMethod.GET)
	public ModelAndView memberRegPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("memberReg", "message", message);
		
	}
	
	@RequestMapping(value = { "/memberList" }, method = RequestMethod.GET)
	public ModelAndView memberListPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("memberList", "message", message);
		
	}
	
	@RequestMapping(value = { "/memberUpdate" }, method = RequestMethod.GET)
	public ModelAndView memberUpdatePage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("memberUpdate", "message", message);
		
	}
	
	@RequestMapping(value = { "/salaryReport" }, method = RequestMethod.GET)
	public ModelAndView salaryReportPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("salaryReport", "message", message);
		
	}
	
	@RequestMapping(value = { "/salaryList" }, method = RequestMethod.GET)
	public ModelAndView salaryListPage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("salaryList", "message", message);
		
	}
	@RequestMapping(value = { "/salaryUpdate" }, method = RequestMethod.GET)
	public ModelAndView salaryUpdatePage(ModelMap model) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("salaryUpdate", "message", message);
		
	}
	
}
