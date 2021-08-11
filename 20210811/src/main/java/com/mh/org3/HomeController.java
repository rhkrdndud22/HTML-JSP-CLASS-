package com.mh.org3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1.자바 버전 맞추기 bulid path project facets
 * 
 * 2. web.xml j 대문자로 바꾸기
 * 
 * 3. pojo방식을 사용하기 위해 cglib.jar 파일 maven에서 가져오기 context:annotationconfig 태그
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model) {

		return "insert";
	}

	@RequestMapping(value = "/bb", method = RequestMethod.GET)
	public String bb(Model model) {

		return "bb";
	}

	@RequestMapping(value = "/cc", method = RequestMethod.GET)
	@ResponseBody
	public String cc(Model model) {

		return "cc";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)

	public String delete(Model model) {

		return "delete";
	}

	
	 @RequestMapping(value = "/update", method = RequestMethod.GET)
	  
	  public String update(Model model) {
	 
	  return "update"; }
	 
}
