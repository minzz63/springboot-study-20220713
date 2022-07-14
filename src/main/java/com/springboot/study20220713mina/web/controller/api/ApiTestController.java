package com.springboot.study20220713mina.web.controller.api;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.study20220713mina.web.dto.TestRespDto;
import com.springboot.study20220713mina.web.dto.UserDto;

@RestController
@RequestMapping("/api/v1")
public class ApiTestController {
	
	@GetMapping("/test")
	public Object getTest() {
		return TestRespDto.builder().username("junil").password("1234").build();
	}
	
	@PostMapping("/test")
	public String postTest() {
		return "test data(post)";
		
	}
	

/* 요청메소드: post
* 요청주소: /api/v1/user
* user 클래스 생성
* username
* password
* name
* email
* jason으로 응답받기 
*/ 


	@PostMapping("/user")
	public Object aaaa() {
		return UserDto.builder().username("aaa").password("1234").name("김준일").email("alskfl334@gmail.com").build();
		
	}
}
