package com.vueboard.service;

import org.springframework.stereotype.Service;

import com.vueboard.entity.User;
import com.vueboard.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class userService {
	
	private final UserMapper userMapper;
	
	// 로그인
	public User login(String memberId, String password) {
		return userMapper.login(memberId, password);
	}
}
