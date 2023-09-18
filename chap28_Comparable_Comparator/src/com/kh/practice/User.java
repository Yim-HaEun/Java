package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	
	@Override
	public int compare(String user1, String user2) {
		
		//길이가 같으면 0반환 
		if(user1.length() == user2.length()) {
			return 0;
		//user1이 user2 보다 길면 양수 반환
		}else if(user1.length() == user2.length()) {
			return 1;
		}
		//user1이 user2보다 짧으면 음수 반환
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// List ArrayList 생성 Comparator 정리
		List<String> user = new ArrayList<>();
		user.add("이상혁");
		user.add("이하혁");
		user.add("HideOnBush");
		user.add("[SKT T1]Faker");
		user.add("고전파");
		
		//Comparator를 사용해서 문자열을 정렬 
		Collections.sort(user, new User());
		
		//정렬된 결과 출력
		for(String u : user) {
			System.out.println(u);
		}
	}
}
