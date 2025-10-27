package com.vueboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.vueboard.entity.Board;
import com.vueboard.entity.Chat;
import com.vueboard.entity.ChatMessage;

@Mapper
public interface ChatMapper {
	int insertChat(ChatMessage message);
}
