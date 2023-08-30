package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("과일을 선택해주세요");
		
		int fruit = sc.nextInt();
		
		switch(fruit) {
		case 1:
			System.out.println("사과");
			break;
		case 2:
			System.out.println("포도");
			break;
		default : 
			System.out.println("잘못된 선택입니다.");
		}
		//Scanner를 이용해서 과자를 선택하는 switch문 만들기
		System.out.println("과자를 선택해주세요.1.초코과자 2.감자칩과자 3.딸기과자");
		
		boolean isChoice = false;
		int snack = sc.nextInt();
		
		switch(snack) {
		case 1:
			System.out.println("초코과자");
			break;
		case 2: 
			System.out.println("감자칩 과자");
			break;
		case 3:
			System.out.println("딸기 과자");
			break;
		default : 
			System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
		}
	}
}
		
		
		/*
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1.아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카페모카");
			
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("아메리카노 주문하셨습니다.");
			break;
		case 2:
			System.out.println("카페라떼 주문하셨습니다.");
			break;
		case 3:
			System.out.println("카페모카 주문하셨습니다.");
			break;
		default:
			System.out.println("잘못된 선택입니다. 다시 주문해주세요");
		}
	}
	*/

