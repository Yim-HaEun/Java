package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로길이: ");
		double width, height;
		
		width = sc.nextDouble();
		System.out.print("세로길이: ");
		height = sc.nextDouble();
		System.out.println("가로: " + width + "세로: " + height);
	}

}
