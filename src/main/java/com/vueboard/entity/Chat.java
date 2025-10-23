package com.vueboard.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Chat {

	private long chatId;
	private String memberId;
	private String name;
	private String message;
	private LocalDateTime sendtime;
}
