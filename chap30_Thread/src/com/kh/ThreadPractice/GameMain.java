package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;


public class GameMain {
	static GameLoop gl = new GameLoop();

	private static boolean isGameOver = false;
	public boolean getisGameOver() {
		return isGameOver;
	}
	public static void setGameOver(boolean isGameOver) {
		GameMain.isGameOver = isGameOver;
	}
	public static void main(String[] args) {
		// private static boolean isGameOver = false;
		
			//외부 클래스의 인스턴스를 생성
			//GameMain s = new GameMain();
			
			//게임 루프 스레드 시작
			Thread gameThread = new Thread(gl);
			gameThread.start();
			
			//게임 종료 조건 : 플레이어가 Enter 키를 누르면 게임 종료
			try {
				System.in.read(); //사용자가 키보드로 입력한 바이트를 읽음, 사용자가 Enter키를 누를때까지 프로그램 일시 중지
				isGameOver = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}



