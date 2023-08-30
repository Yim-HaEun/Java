package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	
	public static void main(String[]args) {
	//키보드에서 정수 두개를 입력받아 두 수의 합 차 곱 나누기한 몫과 나머지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int inum4,inum5;
		inum4 = sc.nextInt();
		System.out.println("정수를 입력하세요");
		inum5 = sc.nextInt();
		
		System.out.println(inum4 - inum5);
		
	}
}