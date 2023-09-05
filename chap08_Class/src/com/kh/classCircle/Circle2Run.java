package com.kh.classCircle;

public class Circle2Run {

	public static void main(String[] args) {
		// 기본생성자 객체 생성!
		Circle2 circle = new Circle2();
		//초기 원의 둘레와 넓이를 계산하고 출력해보자!'
		
		//final double PI = 3.14;
		//private final double PI = 3.14;
		
		System.out.println("초기에 원의 정보를 알고싶다");
		//inRadius
		circle.AreaCircle();
		circle.SizeofCircle();
		//AreaCircle
		//SizeOfCircle
		
		//반지름을 1씩 증가시킨다.
		circle.inRadius();
		//원의 둘레와 넓이가 반지름 1씩 증가한 다음 계산 출력하기
		System.out.println("반지름을 1씩 증가시킨 후 원의 정보");
		circle.AreaCircle();
		circle.SizeofCircle();

	}

}
