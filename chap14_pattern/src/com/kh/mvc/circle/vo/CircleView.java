package com.kh.mvc.circle.vo;

import java.util.Scanner;
public class CircleView {
	public double getUserInput1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		return scan.nextDouble();
		
	}//결과
	public void display(double result) {
		System.out.println("결과 : " + result);
		
	}

}
