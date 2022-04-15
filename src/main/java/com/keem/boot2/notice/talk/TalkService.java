package com.keem.boot2.notice.talk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keem.boot2.notice.NoticeService;
import com.keem.boot2.notice.NoticeVO;
@Service
public class TalkService implements NoticeService {
	@Autowired
	private TalkMapper talkMapper;

	@Override
	public List<NoticeVO> getList() throws Exception {
		List<NoticeVO> ar=talkMapper.getList();
		return ar;
	}

	@Override
	public NoticeVO getDetail(NoticeVO noticeVO) throws Exception {
		return talkMapper.getDetail(noticeVO);
	}

	@Override
	public int setAdd(NoticeVO noticeVO) throws Exception {
		return talkMapper.setAdd(noticeVO);
	}

	@Override
	public int setUpdate(NoticeVO noticeVO) throws Exception {
		return talkMapper.setUpdate(noticeVO);
	}

	@Override
	public int setDelete(NoticeVO noticeVO) throws Exception {
		return talkMapper.setDelete(noticeVO);
	}

}
