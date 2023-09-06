package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	@Override
	public void sleep() {
		System.out.println(getName() + "가 자다가 깼어요");
	}
	public void eat() {
		System.out.println(getName() + "는 바나나만 먹어요" );
	}

}
