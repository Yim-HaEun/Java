package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getUserInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		return scan.next();
	}
	//결과
	public void displayName(String result) {
			System.out.println("이름 : " + result);
		
	}
		

}
