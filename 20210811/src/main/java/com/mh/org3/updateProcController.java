package com.mh.org3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.org3.db.DBManager;

@Controller
public class updateProcController {
	@Autowired
	DBManager dbm;

	@RequestMapping(value = "/updateproc", method = RequestMethod.POST)
	public String updateproc(Model model,String para1,String para2) {
		
		dbm.updateTest(para1,para2);
		return "updateproc";
	}

}
