package com.vueboard.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vueboard.service.ChatService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true") // Vue 포트 허용(Nuxt vue용)
public class ChatRestController {
	private ChatService chatService; 
	
	
}
