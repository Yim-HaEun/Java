package com.kh.practice.array;

import java.util.Random;


public class practice13 {

	public static void main(String[] args) {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
		//1~10 사이의 난수를 발시켜 중복된 값이 없게 배열에 초기화한 후 출
		Random r = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i<10; i++) {
			arr[i] = r.nextInt(10)+1; //랜덤 생
			for(int j =0; j<i; j++) {
				if(arr[i]==arr[j]) {//중복 값 체크 
						i--;
					}
				}
			}
			for(int k =0; k<arr.length; k++) {
				System.out.print("  "+arr[k]);
			}
	}
			
}


