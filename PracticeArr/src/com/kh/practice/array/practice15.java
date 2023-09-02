package com.kh.practice.array;
import java.util.Scanner;
public class practice15 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장
		//문자의 개수와 함께 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 : ");
		String word = scan.next();
		String[] arr = word.split("");
		
		System.out.print("문자열에 있는 문자 : ");
		 for(int i =0; i <arr.length; i++) {
			 System.out.print( arr[i]+",");
			 
		 }

	}

}
