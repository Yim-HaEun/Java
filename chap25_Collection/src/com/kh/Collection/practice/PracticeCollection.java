package com.kh.Collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 for 문 출력하기
		pList.add("안녕");
		pList.add("헬로");
		pList.add("곤니치와");
		pList.add("완샹");
		pList.add("안녕");
		System.out.println("List(중복 허용) : ");
		for(String greeting : pList) {
			System.out.println(greeting);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 for문 출력, 중복된 값 add 해야함
		pSet.add("한국");
		pSet.add("미국");
		pSet.add("일본");
		pSet.add("홍콩");
		pSet.add("한국");
		
		System.out.println("Set(중복 불가) : ");
		for(String Nation : pSet) {
			System.out.println(Nation);
		}
		
	}
	public void practiceMap() {
		//키와 값을 이용해서 map put 한 다음, 향상된 for문으로 출력해보기
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("반지의 제왕", 15);
		myMap.put("중경삼림", 2);
		myMap.put("킬빌", 5);
		myMap.put("킹스맨", 3);
		myMap.put("인셉션", 1);
		
		for(String movie:myMap.keySet()) {
			int code = myMap.get(movie);
			System.out.println(movie+ " : " + code);
		}
		
	}

}
