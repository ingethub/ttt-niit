package com.niit.ttt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/home")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Page") String name) {
//		System.out.println("wiring syout in controller");

		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
