package com.springboot.study20220713mina.web.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestRespDto {
	private String username;
	private String password;
}
