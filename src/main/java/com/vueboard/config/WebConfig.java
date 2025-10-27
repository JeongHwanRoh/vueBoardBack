package com.vueboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//작동 원리
//
//SockJS는 WebSocket 연결 전에 xhr-polling 기반의 preflight 요청(OPTIONS, GET /info) 을 날린다.
//
//이 요청은 WebSocket 핸들러(WebSocketConfig)가 아니라 Spring MVC DispatcherServlet이 먼저 받는다.
//
//MVC에서 Access-Control-Allow-Origin 헤더가 없으면 브라우저가 CORS 차단.
//
//따라서 WebMvcConfigurer.addCorsMappings() 으로 전역 CORS 허용이 필요하다.
@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://localhost:3000").allowedMethods("*").allowCredentials(true);
	}
}
