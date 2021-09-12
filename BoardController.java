  
package com.mh.mocom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mh.mocom.dao.BoardDao;
import com.mh.mocom.dto.BoardDto;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	BoardDao dao;
	
	@RequestMapping(value="main")
	public String main(Model model) {
		List<BoardDto> list=dao.selectlist();
		if(list.size() <6) {
			while(list.size() !=5)
				list.add(new BoardDto());
		}
		model.addAttribute("list", list);
		model.addAttribute("title", "Qna");
		return "board/main";
	}
	
	@RequestMapping(value="qna")
	public String qna(Model model) {
		List<BoardDto> list=dao.selectlist();
		if(list.size() <6) {
			while(list.size() !=5)
				list.add(new BoardDto());
		}
		model.addAttribute("list", list);
		model.addAttribute("title", "Qna");
		return "board/main";
	}
	@RequestMapping(value="gallery")
	public String gallery(Model model) {
		List<BoardDto> list=dao.selectlist();
		if(list.size() <6) {
			while(list.size() !=5)
				list.add(new BoardDto());
		}
		model.addAttribute("list", list);
		model.addAttribute("title", "Qna");
		return "board/main";
	}
}