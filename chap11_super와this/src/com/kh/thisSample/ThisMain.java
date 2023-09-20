package com.kh.thisSample;
/*
this 객체(=인스턴스) : 자신을 가리키는 참조변수 객체(=인스턴스)의 주소가 저장
this() : 현재 클래스의 다른 생성자를 호출하는데 사용

	
		int x = 10; //정수 x를 10값 할당
		int y = x; //참조 변수 y x를 가리킨다.
		
		x =20;
		
		System.out.println("y : " + y); //10
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2, list1
*/
class MyClass{
	int myField; //this.myField
	
	//첫 번째 생성자
	MyClass(){
		this(0); //this() 사용해서 다른 생성자 호출 == this.myField =0;
	}
	//두 번째 생성자
	MyClass(int value){
		this.myField = value;
	}
	void printValue() {
		System.out.println("myField의 값 : "+ this.myField);
	}
}

public class ThisMain {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();// 첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); //두 번쨰 생성자 호출

		obj1.printValue();
		obj2.printValue();
	}
}
