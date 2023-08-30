package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는" + age + "입니다.");
		
		
		String name;
		int phoneNumber;
		
		
		
		System.out.print("당신의 이름을 입력하세요.");
		name = sc.next();
		System.out.println("당신의 이름은" + name + "입니다.");
		System.out.print("당신의 번호를 입력하세요.");
		phoneNumber = sc.nextInt(); //하이픈 넣지말것
		System.out.println("당신의 전화번호는 " + phoneNumber + "입니다.");
		
		
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		String hobby;
		String food;
		String myAddress;
		
		System.out.print("당신의 취미가 무엇입니까?");
		hobby = sc.next();
		System.out.println("당신의 취미는 " + hobby +"군요!");
		System.out.print("당신이 좋아하는 음식은 무엇입니까?");
		food = sc.next();
		System.out.println("당신의 좋아하는 음식은 " + food +"군요!");
		System.out.print("당신의 주소는 무엇입니까?");
		myAddress = sc.next();
		System.out.println("당신의 주소는 " + myAddress +"군요!");
		
		String name1, name2;
		
	}

}
