package com.SpringSecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
		
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@ResponseBody
	@GetMapping("/hi")
	public String hi() {
		System.out.println("Hello...");
		return "hi-there welcome to security";
	}

}
