package com.kh.genericspractice;

import java.util.ArrayList;

import javax.swing.Box;

public class PracticeMain {

	
	
	public void practice1() {
		
			ArrayList<Integer> intList = new ArrayList<>();
			intList.add(1);
			intList.add(2);
			intList.add(5);
			
			ArrayList<String> strList = new ArrayList<>();
			strList.add("안녕하세요");
			strList.add("잘가");
			
			printList(intList);
			printList(strList);
		}
	public static <T> void printList(ArrayList<T> list){
	for(T item : list) {
				System.out.println(item);
			}
		
	}

	public void practice2() {
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		// 문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각각 출력
		//향상된 for 문 이용해서 값 모두 출력
		Box<Integer> intBox = new Box<>();
		intBox.put(1);
		intBox.put(2);
		
		int intValue = intBox.get();
		
		Box<String> strBox = new Box<>();
		strBox.put("플스4");
		strBox.put("장갑");
		
		String strValue = strBox.get();
		
		System.out.println("IntValue : " + intValue);
		System.out.println("String Value : " + strValue);
		
	}//public static <B> void printList(Box<B> list){
		//for(B item : list) {
			//System.out.println(item);
		//}
	
	//}
}
