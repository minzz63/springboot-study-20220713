package com.springboot.study20220713mina.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;

public class PageController {

		@GetMapping({"/","/index"})
		public String indexPage() {
			return "index";
		}
}
