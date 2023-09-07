package com.kh.example.practice2.model.vo;

public class Circle {
	//필드 멤버변수
	private double PI = 3.14;
	private int radius = +1;
	
	
		
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}

	public void setPI(double pI) {
		this.PI = PI;
		
	}
	public void setRadius(int radius) {
		this.radius = radius;
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
