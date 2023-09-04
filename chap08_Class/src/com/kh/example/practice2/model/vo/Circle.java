package com.kh.example.practice2.model.vo;

public class Circle {
	//필드 멤버변수
	double PI =3.14;
	int radius=1;
	
	//생성자
	public Circle() { //기본 생성자, 아무런 초기화를 진행하지 않는다.
		
	}
	//메서드 
	
	public void incrementRadius() {
		radius++;
		System.out.println("반지름 : "+ radius);
	
	}
	public void  getAreaOfCircle() {
		System.out.println("원의 넓이 : " + (PI*radius*radius) );
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + (2*PI*radius));
	}
	
	
	


}
