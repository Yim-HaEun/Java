package com.kh.claasSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		Student student1 = new Student("임하은",20,"1학년");
		Student student2 = new Student("서태웅",20,"1학년");
		Student student3 = new Student("강백호",20,"1학년");
		Student student4 = new Student("정대만",22,"3학년");
		//학생 정보 출력
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		//학생을 3명 만들어서 3명 출력하기
		//student2, student3, student4
		//각각의 이름과 나이와 학년을 displayInfo();를 사용해서 출력하세요.

	}

}
