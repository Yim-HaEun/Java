package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + "주인이와서 달린다!");
	}
	@Override
	
	public void eat() {
		System.out.println(getName() + "는 먹는데 중간에 뺏어먹는다.");
	}
	//animal에 적혀있는  eat 울 고양이 안에서만 다시 정의를 내린다.

}
