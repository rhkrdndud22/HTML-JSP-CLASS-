package org1;

import java.util.ArrayList;

public class MemberService {
	
	public static ArrayList<Member> member_list= new ArrayList<Member>();
	
	public void insert(String name, int age) {
		Member member = new Member();
		member.setName(name);
		
		member.setAge(age);
		member_list.add(member);
	}
	
	public void dolist() {
		
		for(Member member:member_list) {
			System.out.println(member);
		}
	}
}
