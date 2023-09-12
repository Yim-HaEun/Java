package com.kh.abstractSample.Animal;

 abstract class Animal {
	//필드 String name;
	private String name;
	
	
	//생성자 
	public Animal(String name) {
		this.name = name;
		
		
	}
	//일반메서드 동물 이름 출력 void displayName();
	
	public  void setdisplayName(String displayName) {
		this.name = displayName;
	}
	public String getdisplayName() {
		return name;
	}
	
	//추상메서드 동물 소리 출력 void makeSound();
	public	abstract String makeSound();
			
		
	
	

}
