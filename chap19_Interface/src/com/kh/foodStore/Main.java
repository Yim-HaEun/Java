package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		// 					  FoodStore -> 객체가 아니라서 생성할 수 없다.
		FoodStore order = new Order();
		order.addMenu("짬뽕 주문");
		order.addMenu("짜장면 주문");
		order.addMenu("굴짬뽕 주문");
		order.printMenu();
	}

}
