package com.keem.boot2.notice.talk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.keem.boot2.notice.NoticeVO;

@Controller
@RequestMapping("/talk/*")
public class TalkController {

	@Autowired
	private TalkService talkService;
	
	//model.attribute ("notice","talk") notice 라는 이름으로 talk로 보내겠다.
	@ModelAttribute("notice")
	public String getNotice() {
		
		return "talk";
	}
	
	@GetMapping("list")
	public ModelAndView getList() throws Exception{
		ModelAndView mv = new ModelAndView();
		List<NoticeVO> ar = talkService.getList();
		mv.addObject("list",ar);
		mv.setViewName("notice/list");
		
		
		return mv;
	}
	
	
	@GetMapping("detail")
	public String getDetail(NoticeVO noticeVO,Model model) throws Exception{
		noticeVO=talkService.getDetail(noticeVO);
		model.addAttribute("dto",noticeVO);
		return "notice/detail";
	}
	@GetMapping("add")
	public ModelAndView setAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/add");
		return mv;
	}
	
//	@GetMapping("add")
//	public String setAdd(NoticeVO noticeVO) throws Exception{
//		int result = talkService.setAdd(noticeVO);
//		return "redirect:./list";
//	}
	
}
