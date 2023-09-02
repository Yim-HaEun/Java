package com.kh.practice.array;
import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
	//실습문제 3
	//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int  num = scan.nextInt();
		
		int [] arr  = new int [num]; // 입력받은 수만큼 배열크기 지정 
		
		for(int i =1; i<=arr.length; i++) {
			System.out.print(i + " ");
		}
		
		
	}

}
