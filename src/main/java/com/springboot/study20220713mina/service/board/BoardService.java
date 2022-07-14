package com.springboot.study20220713mina.service.board;

import com.springboot.study20220713mina.web.dto.board.CreateBoardReqDto;

public interface BoardService {
	
	public Boolean createBoard(CreateBoardReqDto createBoardRedDto) throws Exception;
	// public Boolean readBoard(CreateBoardRedDto createBoardRedDto) throws Exception;
	public Boolean updateBoard(int boardcode, CreateBoardReqDto createBoardRedDto) throws Exception;
	public Boolean deleteBoard(int boardcode) throws Exception;
	
}
