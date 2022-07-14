package com.springboot.study20220713mina.web.dto.board;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateBoardReqDto {
		private String title;
		private int usercode;
		private String content;
}
