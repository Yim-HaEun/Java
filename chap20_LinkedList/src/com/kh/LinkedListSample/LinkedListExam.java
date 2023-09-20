package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//List 인터페이스 LinkedList 객체 활용해서 값 넣고 출력
		//String 값 넣고 수정, 삭제, 출력
		List<String> LinkedList = new LinkedList<>();
		LinkedList.add("값 넣기 1");
		LinkedList.add("값 넣기 2");
		LinkedList.add("값 넣기 3");
		
		LinkedList.set(0,"값 수정1");
		
		LinkedList.remove(2);
		
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고 수정, 삭제 출력
		
		LinkedList<int> LinkedList = new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.set(0,5);
		linkedList.remove(2);
		
		
	}

}
