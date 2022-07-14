package com.springboot.study20220713mina.service.board;

import org.springframework.stereotype.Service;

import com.springboot.study20220713mina.web.dto.board.CreateBoardReqDto;

@Service
public class BoardServiceImplements implements BoardService{

	@Override
	public Boolean createBoard(CreateBoardReqDto createBoardRedDto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(createBoardRedDto);
		if(0 == 0) {
			throw new RuntimeException();
		}
		return true;
	}

	@Override
	public Boolean updateBoard(int boardcode, CreateBoardReqDto createBoardRedDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteBoard(int boardcode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
