package com.kh.foodStore;
import java.util.ArrayList;
import java.util.List;
//주문 객체
public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>(); //주문 내용들
		
	}
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	@Override
	public void printMenu() {
		System.out.println("주문 내역 : "); //menuA.getItem();
		for (Menu menuA : OrderMenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}
