package com.keem.boot2.notice.talk;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keem.boot2.notice.NoticeVO;
@SpringBootTest
class TalkMapperTest {

	@Autowired
	private TalkMapper talkMapper;
	
	@Test
	void setAddTest() throws Exception {
		NoticeVO noticeVO= new NoticeVO();
		noticeVO.setTitle("title 1");
		noticeVO.setWriter("kim");
		noticeVO.setContents("idn");
		
		int result = talkMapper.setAdd(noticeVO);
		
		assertEquals(1, result);
		
	}
	
	@Test
	void getList() throws Exception{
		List<NoticeVO> ar = talkMapper.getList();
		assertNotEquals(1, ar.size());
		
	}
	@Test
	void getDetail() throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(262L);
		noticeVO=talkMapper.getDetail(noticeVO);
		assertNotNull(noticeVO);
	}

	@Test
	void setUpdate() throws Exception{
		NoticeVO noticeVO= new NoticeVO();
		noticeVO.setTitle("spring boot test");
		noticeVO.setContents("spring boot");
		noticeVO.setNum(263L);
		int result=talkMapper.setUpdate(noticeVO);
		assertEquals(1, result);
	}
	@Test
	void setDelete() throws Exception{
		NoticeVO noticeVO= new NoticeVO();
		noticeVO.setNum(265L);
		int result = talkMapper.setDelete(noticeVO);
		assertEquals(1, result);
	}
}
