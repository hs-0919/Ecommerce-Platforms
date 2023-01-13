package com.naedam.admin.recruit.model.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class recruitDTO {
	
	private int recruitNo;				//게시글 번호
	private String recruitTitle;		//제목
	private int recruitViewcount;		//조회수
	private String recruitStart;		//채용 시작일
	private String recruitEnd;			//채용 마감일
	private String recruitDate;			//게시글 등록일
	private String career;				//경력
	private String recruitDelStatus;	//삭제여부
	private String orgFileName;				//이미지 원래 이름
	private String fileName;			//이미지 파일 이름
	private String filePath;			//이미지 파일 경로
	private int rownum;
	
}
