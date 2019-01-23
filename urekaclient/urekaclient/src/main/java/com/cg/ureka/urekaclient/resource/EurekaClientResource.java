package com.cg.ureka.urekaclient.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class EurekaClientResource {

	@GetMapping
    public String home() {
    	return "helloworld";
    }
}



