package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterPage {
	
	@RequestMapping("")
	public String starterPage() {
		return "Welcome to Spring application";
	}
	
}
