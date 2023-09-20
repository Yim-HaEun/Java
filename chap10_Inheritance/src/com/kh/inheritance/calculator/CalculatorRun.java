package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod{

	public static void main(String[] args) {
		/*scanner 이용해서 코드 변경하기*/
		//Calculator cal = new Calculator();
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("add : " + cal.add());
		System.out.println("mul : " + cal.multiply());
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result1 =  cal.add(num1,num2);
		int result2 = cal.substruct(num1, num2);
		int result3 = cal.multiply(num1, num2);
		int result4 = cal.divide(num1, num2);
		
		System.out.println("Add : "+ result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : "+ result3);
		System.out.println("div : " + result4);
		*/
	}
}
