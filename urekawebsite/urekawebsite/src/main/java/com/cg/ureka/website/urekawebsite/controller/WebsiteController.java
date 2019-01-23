package com.cg.ureka.website.urekawebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebsiteController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/")
	public String display(Model model) {
		ResponseEntity<String> entity = restTemplate.getForEntity("http://helloworld/hello", String.class);
		String hello = entity.getBody();
		model.addAttribute("hello", hello);
		return "index";
		
	}
}
