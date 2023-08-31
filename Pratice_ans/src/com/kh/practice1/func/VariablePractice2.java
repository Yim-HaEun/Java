package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
	
		
		System.out.print("정수를 입력하세요 ");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 ");
		num2 = sc.nextInt();
		
		System.out.println("더하기 결과: " + (num1+ num2));
		System.out.println("빼기 결과: " +( num1 - num2));
		System.out.println("곱하기 결과: " + (num1 * num2));
		System.out.println("나누기  몫 결과: " + (num1 / num2));

	}

}
