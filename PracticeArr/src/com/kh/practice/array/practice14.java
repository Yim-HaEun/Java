package com.kh.practice.array;
import java.util.Arrays;
import java.util.Random;
public class practice14 {
	public static void main(String[] args) {
		//로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순을 정렬하여 출
		
		Random r = new Random();
		int[] arr = new int[6];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = r.nextInt(45)+1;
			for(int j =0; j<i; j++) {
				if(arr[i]==arr[j]) {//중복 값 체크 
						i--;
					}
				}
			}
			for(int k =0; k<arr.length; k++) {
				Arrays.sort(arr);//순서대로 정리 
				System.out.print("  "+arr[k]);
		}
		
	}
}
