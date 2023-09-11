package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		// Array 예제
		int[] intArray = new int[2]; //크기가 5인 정수 배열 생성
		intArray[0]=1;
		intArray[1]=2;
		
		//Array 출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a<intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println();//개행문자 포함되어있어 enter와 같은 역할을 한다.
		// List 예제 Integer = int
									//빈 배열 리스트 생성 
		List<Integer> intList = new ArrayList<>();//Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List 출력
		System.out.println("List 요소 : ");
		for(int num : intList) {
			System.out.print(num + " ");
		}
		//String으로 변경 후 Array와 List 출력해보기
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
