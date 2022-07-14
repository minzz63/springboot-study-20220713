package com.springboot.study20220713mina.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MethodStudyController {

	@GetMapping({"/", "/index"})
	public String getMethod() {
		return "method/get";
	}
	
	@GetMapping("/test")
	public String getMethod2() {
		return "method/test";
	}
	
	@ResponseBody
	@GetMapping("/api/v1/username")
	public String getUsername() {
		return "junil";
	}
	
}
