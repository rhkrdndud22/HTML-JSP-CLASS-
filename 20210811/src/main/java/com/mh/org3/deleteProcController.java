package com.mh.org3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.org3.db.DBManager;

@Controller
public class deleteProcController {

	@Autowired
	DBManager dbm;

	@RequestMapping(value = "/deleteproc", method = RequestMethod.POST)
	public String deleteproc(Model model,String para1) {
		
		dbm.deleteTest(para1);
		return "deleteproc";
	}

}
