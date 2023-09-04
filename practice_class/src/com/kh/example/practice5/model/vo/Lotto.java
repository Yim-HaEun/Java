package com.kh.example.practice5.model.vo;
import java.util.Random;

public class Lotto {
	//lotto : int[]
	// 초기화 블럭 사용,
	//중복하지 않는 1~45까지의 난수들로 6개 초기화
	int[] lotto = new int[6];


	public Lotto() {
}
	public void information() { //로또 번호 출
		Random rd = new Random();// 


		for(int i =0; i<=lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1); //ㄷ랜덤 번호 넣어주기 
				System.out.print(" "+lotto[i]);// 출력
			}
	}
}
