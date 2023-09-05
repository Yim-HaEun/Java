package com.kh.example.practice1.run;

import com.kh.example.practice1.Member;

public class Run {
	/*실행용 메소드로 기본 생성자를 통해 Member type의
	객체를 생성하고 changeName()를 이용해 값 변경 후
	printName()를 이용해 출력*/ 
	public static void main(String[] args) {
		//1.Member객체 생성
		Member member = new Member("");
		//2.changeName()값 변경 
		member.changeName("뉴네임");
		//3.printName()을 이용해 출력
		member.printName();
		

	}

}
