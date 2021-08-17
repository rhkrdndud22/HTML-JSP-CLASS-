package com.org.mh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.org.mh.DBM;
@Controller
public class AController {
	
	@Autowired
	DBM dbm;
	
	@RequestMapping(value = "/a")
	public String a() {
		System.out.println("A a");
		dbm.doa();
		return "a";
	}
}
