package com.kh.practice.array;
import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {
		/*
		 * 월“ ~ “일”까지 초기화된 문자열 배열을 만들고 
		 * 0부터 6까지 숫자를 입력 받아 
		 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
			범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.*/ 
		Scanner scan = new Scanner(System.in);
		String[]  week = {"일" , "월", "화", "수", "목","금","토"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = scan.nextInt();
		
		if(num>6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println( week[num]+ "요일 입니다.");
		}
		
	}

}
