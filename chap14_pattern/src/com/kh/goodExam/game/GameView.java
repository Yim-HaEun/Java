package com.kh.goodExam.game;

public class GameView {
	private String startMsg = "숫자 맞추기 게임 시작합니다.";
	private String StartGss = "1에서 100 사이의 숫자를 맞춰보세요!";
	private String InputGss = "추측한 숫자를 입력하세요.";
	private String CorrectGss = "숫자를 맞췄습니다.";
	private String IncorrectGss = "틀렸습니다. 다시 시도하세요.";
	private String gmovr = "게임 오버 !";

	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(StartGss);
	}
	//숫자를  추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑  시도횟수 게임 종료
	//1.숫자 추측하는 값 입력하기
	public void displayGuessPrompt() {
		System.out.println(InputGss);
	}
	public void displayCorrectGuess() {
		System.out.println(CorrectGss);
	}
	public void displayIncorrectGuess() {
		System.out.println(IncorrectGss);
	}
	public void displayAttempts(int attempts) {
		System.out.println("시도횟수: " + attempts);
	}
	public void displayGameOver() {
		System.out.println(gmovr);
	}
}
