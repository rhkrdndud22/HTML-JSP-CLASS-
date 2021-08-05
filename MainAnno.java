package org1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnno {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AnnoConf.class);
		MemberService ms = acac.getBean(MemberService.class);
		ms.insert("홍길동", 10);
		ms.insert("김길동", 20);
		ms.dolist();
		
		acac.close();
	}
}
