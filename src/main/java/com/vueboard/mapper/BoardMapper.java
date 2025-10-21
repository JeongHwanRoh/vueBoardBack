package com.vueboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.vueboard.entity.Board;

@Mapper
public interface BoardMapper {
    List<Board> getAllBoards(); // 전체 게시글 목록
    Board getBoardById(Long boardId); // 특정 게시글 조회
    int insertBoard(Board board); // 게시글 등록
    int updateBoard(Board board);  // 게시글 수정
    int deleteBoard(Long boardId); // 게시글 삭제
}

