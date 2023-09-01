package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		// 1. 배열의 길이를 선언
		int[] num = new int[10]; //길이가 3인 배열
		//1~0까지의반복문을 이용해서 순서대로 배열 인덱스에 넣은 후 
		for(int i =0; i<num.length;i++) {
			num[i] = i+1;
			System.out.println(num[i]);
		}
		// 그 값을 출력
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	
		
		//길이가 10인 배열을 선언 1~10까지의 값을 반복문을이용해 출력
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		//출력값 : 10 9 8 7 6 5 4 3 2 1
		
		int[] num1 = new int[10]; //
		int val = 10;
		//1~0까지의반복문을 이용해서 순서대로 배열 인덱스에 넣은 후 
		for(int i = 0; i<num.length;i++) {
			num[i] = val--;
			System.out.println(num[i]);
		}
		// 그 값을 출력
		
		//2.길이가 5인 String 배열 선언하고 
		//"사과" "귤" "포도" "복숭아" "참외"로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하기
		
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		
		System.out.println(fruits[1]);
		
		

	}

}
