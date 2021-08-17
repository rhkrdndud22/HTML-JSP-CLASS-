package com.org.mh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.mh.dao.TestDao;
import com.org.mh.dto.TestDto;

@Controller
public class ListController {

	@Autowired
	TestDao dao;
	
	
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		List<TestDto> rvalue = dao.doList();
		model.addAttribute("a",rvalue);
		return "list";
	}	
	
	@RequestMapping(value="insert")
	public String insert(Model model) {
		dao.doInsert();
		return "insert";
	}
}
