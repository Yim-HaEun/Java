package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		/*
		 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 값을 모두 출력하고 
		 * */ 
		Scanner sc = new Scanner(System.in);
				
				System.out.println("숫자를 입력하세요: ");
				int num = sc.nextInt();
				
				if(num < 1) {
					System.out.println("1이상의 숫자를 입력해주세요");
				}else {
					for(; ; ) {//for문 안 완성하기
						System.out.println("");
					}
				}
	

	}

}
