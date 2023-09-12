package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("왈왈이","왈왈");
		Cat cat = new Cat("애옹이", "애옹");
		
		System.out.println("강아지 이름 : " + dog.getdisplayName());
		System.out.println("강아지 소리 : " + dog.makeSound());
		
		System.out.println("고양이 이름 : " + cat.getdisplayName());
		System.out.println("고양이 소리 : " + cat.makeSound());
		//1. cat만들기
		//Cat cat = new Cat("고양이");
		
		//2.객체배열로 Animal 정의해서 출력하기, 다형성을 활용한 객체 다루기
		//Animal[] animal = new Animal[2];
		
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("여우", "...");
		animal[1] = new Cat("백호","어흥");
		
		for(Animal a : animal) {
			a.getdisplayName();
			a.makeSound();
			System.out.println();
		}
		
	}
	

}
