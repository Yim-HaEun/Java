package com.kh.mvc.circle.mo;

public class CircleModel {
	private double number;
	
	public void setNumber1(double number) {
		this.number = number;
	}
	public double CircleLength() {
		return number*2*3.14;
	}

}
