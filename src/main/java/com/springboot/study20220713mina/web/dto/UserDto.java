package com.springboot.study20220713mina.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
	
	private String username;
	private String password;
	private String name;
	private String email;
}
