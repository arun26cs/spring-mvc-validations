package com.canalogies.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyHomeController extends HomeController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "HelloWorld";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "HelloWorld-ans";
	}
	
	
	@RequestMapping("/processFormTwo")
	public String shout(HttpServletRequest request,Model model) {
		
		String name = request.getParameter("studentName");
		name=name.toUpperCase();
		model.addAttribute("modelName", name);
		return "HelloWorld-ans";
	}
	

	@RequestMapping("/processFormParam")
	public String shoutLoud(@RequestParam("studentName") String name,Model model) {
		 
		name=name.toUpperCase();
		model.addAttribute("modelName", name);
		return "HelloWorld-ans";
	}
}
