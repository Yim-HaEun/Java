package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice_1 {

	public static void main(String[] args) {
		// 소수 구하기 
		int count = 0; //나누어떨어지는 수를 여기에 넣을거에요.
		
		Scanner scan = new Scanner(System.in);	//사용자로부터 숫자를 입력받습니다.
		System.out.println("숫자 : ");
		int num = scan.nextInt();
		
		if(num<2) { // 입력한 수가 2보다 작은 경우,
			System.out.println("잘못 입력하셨습니다."); //잘못 입력하셨습니다. 출력
		}else { // 입력한 수가 2보다 큰 경우,
			for(int i =1; i<=num; i++) { //반복문을 사용해서
				if(num%i == 0) {
					count++;
				}else {
					continue;
				}
			}
			if(count == 2) {
				System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}

		}

	}

}
