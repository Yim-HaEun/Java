package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice4 {

	public static void main(String[] args) {
		//영어문자열 값을 키보드로 입력받아 문자 앞에서 앞에서 세 개를 출력하세요
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		word = sc.next();
		char c1 = word.charAt(0);
		char c2 = word.charAt(1);
		char c3 = word.charAt(2);
		System.out.println("첫번째 문자 : " + c1);
		System.out.println("첫번째 문자 : " + c2);
		System.out.println("첫번째 문자 : " + c3);

	}

}