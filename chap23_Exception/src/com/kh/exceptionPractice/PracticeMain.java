package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain exp = new PracticeMain();
		exp.ArithException();
		exp.NPException();
		//exp.NumFormatException();
		
	}

	public void ArithException() {
		//int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		try {
			int r = dividend/divisor;
		
		}catch(ArithmeticException a){
			System.out.println("divisor가 0입니다."+ a.getMessage());
			
		}
		
	}
	public void NPException() {
		String text = "Hello world";
		String subText = null;

		try {
			//indexOf subtext에 있는 null값을 포함한 문자열 검색
			int length = text.indexOf(subText);
		}catch(NullPointerException n){
			System.out.println("값이 없습니다." + n.getMessage());
			
		}
	}
	public void NumFormatException(){
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		}catch(NumberFormatException nfe) {
			System.out.println("오류"+ nfe.getMessage());
		}

	}
}
