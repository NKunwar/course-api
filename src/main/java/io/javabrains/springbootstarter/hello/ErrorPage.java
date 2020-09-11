package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPage {
	
	@RequestMapping("*")
	public String errorPage() {
		return "Enter a valid URL or resource name. ERROR !!!!";
	}
	
	@RequestMapping("**")
	public String checkTwoStars() {
		return "1 or more stars method";
	}
	
//	@RequestMapping("*")     => IllegalStateException Encountered when starting Spring Application
//	public String errorPageWithSameReqMapping() {
//		return "Error Page With Same Request Mapping Method called";
//	} 
	
}
