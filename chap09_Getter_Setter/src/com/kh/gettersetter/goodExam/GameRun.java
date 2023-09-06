package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		//플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("이즈리얼");
		player1.setHealth(-10); //-10체력을 저장해주고
		player1.isValidHealth();//-10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		
		player1.displayInfo();
		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("케이틀린");
		player2.setHealth(700);
		player2.isValidHealth();
		player2.setAttackPower(300);
		player2.ValidAttackPower();
		
		player2.displayInfo();
		
		//System.out.println("라인전 시작");
		//player1.attack(player2);
		//player2.attack(player1);
	
	}

}
