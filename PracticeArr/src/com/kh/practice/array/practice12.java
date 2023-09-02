package com.kh.practice.array;

import java.util.*;

public class practice12 {

	public static void main(String[] args) {
		// 10개의 값ㅇ르 저장할 수 있는 정수형 배열을 선언 및 할당하고 
		//~1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		Random r = new Random(); //랜덤 생
		int[] arr = new int[10];
		int arrMax = 0;
		int arrMin = 0 ;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			System.out.print(" "+ arr[i]);
			Arrays.sort(arr);//순서대로 정리 
		
		}
		System.out.println("");
		System.out.println("최대값 : " + arr[0]);//첫번
		System.out.println("최소값 : " + arr[arr.length-1]);//마지막 
	
		}
}


