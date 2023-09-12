package com.kh.LinkedListSample;


import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// 생성
		List<String> linkedList = new LinkedList<>();
		//요소추가
		linkedList.add("첫번째");
		linkedList.add("두번째");
		linkedList.add("세번째");
		System.out.println("LinkedList : " + linkedList);
		
		//요소 삭제
		linkedList.remove(2);
		
		//요소 검색
		boolean isTrue = linkedList.contains("다섯번째");
		System.out.println("두번째 요소 포함여부 : " + isTrue);
		
		//요소 개수
		int size = linkedList.size();
		System.out.println("크기 : " + size);
		

	}

}
