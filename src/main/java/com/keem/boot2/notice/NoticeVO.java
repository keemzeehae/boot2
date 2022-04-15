package com.keem.boot2.notice;

import java.sql.Date;

import lombok.Data;
@Data
public class NoticeVO {
	//VO  : value object
	//DTO : Data Transfer Object
	//getter setter 수정이 필요한 경우 직접 선언
	private Long num;
	private String title;
	private String contents;
	private String writer;
	private Date regDate;
	private Long hit;
	

}
