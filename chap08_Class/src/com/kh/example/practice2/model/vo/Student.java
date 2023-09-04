package com.kh.example.practice2.model.vo;

public class Student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;

	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	public void information() {
		System.out.println("학년 : " + grade + "학년입니다.");
		System.out.println("반 : " + classroom + "반");
		System.out.println("이름 : " + name + "입니다.");
		System.out.println("키 : " + height + "cm");
		System.out.println("성별 : " + gender);
		
	}

}
