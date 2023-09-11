package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class practice {

	public static void main(String[] args) {
		ListArray1();
		ListArray2();
	}
		
	public static void ListArray1() {
		List<Integer> intList = new ArrayList<>();//Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
			
		System.out.println("List 요소 : ");
		for(int num : intList) {
			System.out.println(num + " ");
		}
	}
	public static void ListArray2() {
		List<String> StringList = new ArrayList<>();
		StringList.add("apple");
		StringList.add("banana");
		StringList.add("can");
		System.out.println("String List 요소 : ");
		for(String n: StringList) {
			System.out.println(n +" ");
		}
		
	}

}


