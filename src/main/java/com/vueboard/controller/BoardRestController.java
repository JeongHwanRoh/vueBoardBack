package com.vueboard.controller;

import com.vueboard.entity.Board;
import com.vueboard.mapper.BoardMapper;
import com.vueboard.service.BoardService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
//@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true") // Vue 포트 허용(일반vue용)
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") // Vue 포트 허용(Nuxt vue용)
public class BoardRestController {

	private final BoardService boardService;
	private final BoardMapper boardMapper;

	// 전체 게시글 목록
	@GetMapping("/list")
	public List<Board> getAllBoards() {
		return boardService.getAllBoards();
	}

	// 특정 게시글 조회
	@GetMapping("/{boardId}")
	public Board getBoardById(@PathVariable Long boardId) {
		return boardService.getBoardById(boardId);
	}

	// 게시글 등록
	@PostMapping("/create")
	public String createBoard(@RequestBody Board board) {
		int result = boardService.insertBoard(board);
		return result > 0 ? "success" : "fail";
	}
	
	// 게시글 수정
	@PutMapping("/update/{boardId}")
	public ResponseEntity<String> updateBoard(
	        @PathVariable Long boardId,
	        @RequestBody Board board) {
	    board.setBoardId(boardId);
	    int result = boardMapper.updateBoard(board);
	    return result > 0
	        ? ResponseEntity.ok("update success")
	        : ResponseEntity.status(HttpStatus.BAD_REQUEST).body("update failed");
	}
	
	// 게시글 삭제
	@DeleteMapping("/delete/{boardId}")
	public String deleteBoard(@PathVariable Long boardId) {
		int result = boardService.deleteBoard(boardId);
		return result > 0 ? "success" : "fail";
	}
}
