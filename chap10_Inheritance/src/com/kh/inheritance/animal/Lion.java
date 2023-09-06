package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super (name);
	}
	@Override
	
	public void eat() {
		System.out.println(getName() +"는 먹어도 먹어도 배고파요");
	}

}
