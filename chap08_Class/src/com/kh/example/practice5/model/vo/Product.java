package com.kh.example.practice5.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand){
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}
	public void information() {
		System.out.println("제품이름 : " + pName);
		System.out.println("가격 : " + price);
		System.out.println("브랜드 : " + brand);
	}

}
