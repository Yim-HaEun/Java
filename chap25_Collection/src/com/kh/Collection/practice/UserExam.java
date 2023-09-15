package com.kh.Collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	//이름 나이
	public static void main(String[] args) {
		Map <String, Integer> userSalary = new HashMap<>();
		
		userSalary.put("채치수",5000);
		userSalary.put("강백호", 15000);
		userSalary.put("서태웅", 25000);
		
		
		String userName = "서태웅";
		
		if(userSalary.containsKey(userName)) {
			int salary = userSalary.get(userName);
			System.out.println(userName + "의 연봉(만 원) " + salary);
			
		}else {
			System.out.println(userName + "의 연봉을 찾을 수 없습니다.");
		}
		
	}

}
