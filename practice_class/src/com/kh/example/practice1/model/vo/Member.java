package com.kh.example.practice1.model.vo;

public class Member {
	String memberId = "gkdms";
	String memberPwd = "gkdms123";
	String memberName = "임하은";
	int age = 20;
	char gender = 'F';
	String phone = "01094723499";
	String email = "gkdms2710@naver.com";
	
	public Member(String memberName) {
		this.memberName = memberName;
		
	}
	public void changeName(String memberName) {
		System.out.println("이름을 변경했어요 : ");
		memberName = "홍길동";
		
	}
	public void printName() {
		System.out.println(memberName);
		
	}
}
