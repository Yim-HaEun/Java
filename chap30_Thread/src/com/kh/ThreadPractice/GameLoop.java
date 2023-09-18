package com.kh.ThreadPractice;

import java.util.Random;

public class GameLoop extends Runnable{
	
	GameMain gm = new GameMain();
	
	@Override
	public void run() {
		
		while(!gm.getisGameOver()) {
			//게임 루프 내용
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
			
			//게임 루프 지연 시간
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//게임 종료 조건
			//Enter키를 누르면 게임이 종료됩니다.
			System.out.println("게임을 종료하려면 Enter를 누르세요");
		}
	}
	
}
