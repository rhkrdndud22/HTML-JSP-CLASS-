package org1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainXml {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext gxac= new GenericXmlApplicationContext("classpath:xmlConf.xml");
		MemberService ms = gxac.getBean(MemberService.class);
		ms.insert("홍길동", 10);
		ms.insert("김길동", 20);
		ms.dolist();
		
		gxac.close();
	}
}
