package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요 " + name+ "입니다. 오늘 "+ hour+"시에 배송됩니다.");
		System.out.println("저의 성적은 " + score+"입니다." );
		System.out.println(score+ "은 " + grade +" 학점입니다.");
		
		//변수에 이름과 나이와 자신의 성적 (double)로 넣기
		String myName = "임하은";
		int myAge = 25;
		double myScore = 90.5;
		char myGrade = 'A';
		
		System.out.println("제 이름은 "+myName+"입니다. 저의 나이는" +myAge +"이고 제 성적은" + myScore+"이며" +myGrade +"등급입니다.");
		
	}
}
