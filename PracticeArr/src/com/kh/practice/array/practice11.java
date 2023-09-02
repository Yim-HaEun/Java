package com.kh.practice.array;
import java.util.Random;
public class practice11 {

	public static void main(String[] args) {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10사이의 난수를 발생시켜 배열에 초기화한 후 출력.
		
		Random r = new Random(); //랜덤 생
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = r.nextInt(10)+1;
			System.out.print(" "+ arr[i]);
		}
		
		
		
	}

}
