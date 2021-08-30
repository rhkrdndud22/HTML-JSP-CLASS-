package com.mh.mocom.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.mocom.dao.MemberDao;
import com.mh.mocom.dto.MemberDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired

	MemberDao dao;

	@RequestMapping(value = "/loginchk", method = RequestMethod.POST)
	public String home(MemberDto dto,HttpSession session) {
		
		dto =dao.chklogin(dto);
		if(dto !=null) {
			//세션에다가 저장
			session.setAttribute("dto", dto);
			return "chart";
		}
		else{
			//로그인에 실패하였습니다. 아이디 비밀번호를 확인하세요.
			
		return "redirect:/?text=loginfail";
	}
}
}
