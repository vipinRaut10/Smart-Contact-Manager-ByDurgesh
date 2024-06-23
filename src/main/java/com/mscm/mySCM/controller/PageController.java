package com.mscm.mySCM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println(">>>inside PageController >> home method");
		model.addAttribute("sitename", "My Smart Contact Manger");
		model.addAttribute("param2", "this is parameter 2");
		model.addAttribute("param3", "this is parameter 3");
		model.addAttribute("google", "http://www.google.com");
		return("home");
	}
	
	//about route
	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("about page loading");
		return("about");
	}
	
	//services route
	@RequestMapping("/services")
	public String servicesPage() {
		System.out.println("services page loading");
		return ("services");
	}
}
