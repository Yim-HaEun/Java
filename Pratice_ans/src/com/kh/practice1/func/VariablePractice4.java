package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		//영어문자열 값을 키보드로 입력받아 문자 앞에서 앞에서 세 개를 출력하세요
				String word;
				Scanner sc = new Scanner(System.in);
				System.out.print("문자열을 입력하세요: ");
				word = sc.next();
				char c1 = word.charAt(0);//문자를 1자씩 읽음 한자리씩 보기 떄문에 apple 1자가 넘어가 출력할 수 없음->자리 위치 정해서 출력하기
				char c2 = word.charAt(1);
				char c3 = word.charAt(2);
				System.out.println("첫번째 문자 : " + c1);
				System.out.println("두번째 문자 : " + c2);
				System.out.println("세번째 문자 : " + c3);
				
				Scanner scan = new Scanner(System.in);
				System.out.print("문자열을 입력하세요: ");
				String word2 = scan.next();
				
				String a = word2.substring(0,1);
				String p1 = word2.substring(1,2);
				String p2 = word2.substring(2,3);
				
				//한자리가 아니라 자리를 정해서 출력할 수 있음 시작만 정해도되고 끝만 정해도됨
				//자리 위치 정해서 출력하기
				//시작만 할 경우 시작한 인덱스 위치부터 끝까지 출력됨(기본)
				System.out.println("첫번째 문자 : " + a);
				System.out.println("두번째 문자 : " + p1);
				System.out.println("세번째 문자 : " + p2);
				

	}

}
