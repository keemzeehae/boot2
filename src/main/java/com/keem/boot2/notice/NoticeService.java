package com.keem.boot2.notice;

import java.util.List;

public interface NoticeService {

		//list 
		public List<NoticeVO> getList() throws Exception;
		
		//detail
		public NoticeVO getDetail(NoticeVO noticeVO) throws Exception;

		//add
		public int setAdd(NoticeVO noticeVO) throws Exception;
		
		//update
		public int setUpdate(NoticeVO noticeVO) throws Exception;
		
		//delete
		public int setDelete(NoticeVO noticeVO) throws Exception;
	
}
