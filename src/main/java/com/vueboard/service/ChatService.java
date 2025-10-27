package com.vueboard.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vueboard.entity.Chat;
import com.vueboard.entity.ChatMessage;
import com.vueboard.mapper.ChatMapper;

@Service
public class ChatService {
	@Autowired
	private ChatMapper chatMapper;
	
    public void saveMessage(ChatMessage message) {
        chatMapper.insertChat(message);
    }
	
}
