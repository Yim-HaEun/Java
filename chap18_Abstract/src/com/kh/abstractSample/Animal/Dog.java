package com.kh.abstractSample.Animal;

public class Dog extends Animal{
	//»ý¼ºÀÚ super
	private String sound;
	
	public Dog(String name, String sound) {
		super(name);
		this.sound = sound;
	}
	
	//@Override
	public String makeSound() {
		return sound;
	}

}
