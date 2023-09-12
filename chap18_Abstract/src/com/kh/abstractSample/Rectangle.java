package com.kh.abstractSample;

public  class Rectangle extends Shape{
	private double height;
	private double width;
	
	//»ý¼ºÀÚ
	public Rectangle(String color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	@Override
	public double calculateArea1() {
		return height*width;
	}

}
