package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// 실수형(소수점)으로 국어,영어,수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
				//이 때 총점과 평균은 정수형으로 처리하세요.
				Scanner sc = new Scanner(System.in);
				double korean, english, math;
				
				System.out.print("국어점수 : ");
				korean = sc.nextDouble();
				

				System.out.print("영어점수  : ");
				english = sc.nextDouble();
				
				System.out.print("수학점수 : ");
				math = sc.nextDouble();
			
				System.out.println("");
				int avg = (int) (korean+english+math);
				int totalScore = (int)(korean+english+math)/3;
				System.out.println("총점 : " +avg);
				System.out.println("평균  : " + totalScore);

	}

}
