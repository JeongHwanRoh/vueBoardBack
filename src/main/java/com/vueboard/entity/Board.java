package com.vueboard.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
   
   private long boardId;
   private String title;
   private String content;
   private String writerId;
   private Date regdate;
   private int viewcnt;
   private String category;
   
}
