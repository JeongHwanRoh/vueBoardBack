package com.vueboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vueboard.entity.Board;
import com.vueboard.entity.User;
import com.vueboard.mapper.BoardMapper;
import com.vueboard.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardMapper boardMapper;

	// 전체 게시글 목록
	public List<Board> getAllBoards() {

		return boardMapper.getAllBoards();
	}

	// 특정 게시글 조회
	public Board getBoardById(long boardId) {

		return boardMapper.getBoardById(boardId);
	}

	// 게시글 등록
	public int insertBoard(Board board) {

		return boardMapper.insertBoard(board);
	}

	// 게시글 삭제
	public int deleteBoard(long boardId) {

		return boardMapper.deleteBoard(boardId);

	}

}
