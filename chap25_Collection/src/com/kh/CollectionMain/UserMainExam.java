package com.kh.CollectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		//HashMap 생성  UserAge
		Map<String, Integer> userInfo = new HashMap<>();
		
		//유저의 이름과 번호
		userInfo.put("채치수", 4);
		userInfo.put("정대만", 14);
		userInfo.put("송태섭", 7);
		userInfo.put("강백호", 11);
		userInfo.put("서태웅", 10);
		
		//특정 유저 검색
		String userName = "정대만";
		if(userInfo.containsKey(userName)) {
			int number = userInfo.get(userName);
			System.out.println(userName+ "의 번호 : " + number);
		}else {
			System.out.println(userName + "의 등번호가 없습니다.");
		}
		//모든 유저 번호 출력
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int number = entry.getValue();
			System.out.println(name + " : " + number);
		}
		
		//유저 번호 수정

		String userUpdate = "강백호";
		int newNum = 11;
		userInfo.put(userUpdate, newNum);
		System.out.println(userInfo + "는 번호를 빼앗아 " + newNum + "이 되었습니다.");
		
		String userUpdate1 = "서태웅";
		int newNum1 = 10;
		userInfo.put(userUpdate1, newNum1);
		System.out.println(userInfo + "는 번호를 빼앗겨 " + newNum1 + "이 되었습니다.");
		
		//유저 탈퇴
		String removeUser = "채치수";
		userInfo.remove(removeUser);
		
		System.out.println(removeUser + "는 은퇴를 했습니다.");
		//최종 유저 이름 나이 출력
		System.out.println("북산 최종 출전 멤버 : ");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int num = entry.getValue();
			System.out.println(name + " : " +num);
		}

	}

}
