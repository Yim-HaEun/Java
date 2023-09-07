package com.kh.superSample;

public class superMain {
	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("홍길동");
		
		child2.display();
		
		//super.display(); 했을 때 어떻게 되는지
		//super.display(); 얘를 사용하고 싶다면 어떻게 해야하는지 ?
		//블로그에 적을 숙제
	}

}
