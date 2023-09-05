package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		//플레이 생성자 만들기
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("이즈리얼");
		player1.setHealth(800);
		player1.setAttackPower(150);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("케이틀린");
		player2.setHealth(700);
		player2.setAttackPower(300);
		
		player2.displayInfo();
		
		System.out.println("라인전 시작");
		player1.attack(player2);
		//player2.attack(player1);
	}

}
