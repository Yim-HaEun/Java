package com.kh.instance.cafe;

public class Cafe {
	private String type; //음료 종류 
	private int size; //음료 사이즈
	private boolean isSugar; // 설탕여부
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void cafeMenu() {
		System.out.println("주문을 받겠습니다.");
		System.out.println("종류 : " + type);
		System.out.println("사이즈 : " + size);
		
		if(isSugar) { //true
			System.out.println("설탕을 추가합니다.");
		}
		
	}
	
	
}
