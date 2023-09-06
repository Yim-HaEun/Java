package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("´ó´óÀÌ");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("¾ß¿ËÀÌ");
		
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("³¢³¢");
		
		myMonkey.sleep();
		myMonkey.eat();
		
		Lion myLion = new Lion("¾îÈïÀÌ");
		myLion.eat();

	}

}
