package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe client1 = new Cafe("아메리카노",1,false);
		Cafe client2 = new Cafe("라떼",1,true);
		Cafe client3 = new Cafe("자몽허니블랙티", 2, true);
		
		client1.cafeMenu();
		client2.cafeMenu();
		client3.cafeMenu();

	}

}
