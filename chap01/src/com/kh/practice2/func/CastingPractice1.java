package com.kh.practice2.func;
import java.util.Scanner;
public class CastingPractice1 {

	public static void main(String[] args) {
		//키보드 문자 하나를 입력받아 그문자의 숫자를 출력하세요
	Scanner sc = new Scanner(System.in);	
	char c;
	System.out.print("문자: ");
	c = sc.next().charAt(0);
	
	System.out.print(c + "  unicode :  ");
	System.out.println((int) c);
	

	}

}