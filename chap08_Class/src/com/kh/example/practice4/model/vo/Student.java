package com.kh.example.practice4.model.vo;

public class Student {
/*
 * grade : int
- classroom : int
- name : String
- height : double
- gender : char
 * */
	//1.멤버변수
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	//2.생성자 Student()
	public Student() {
		this.grade = 1;
		this.classroom = 11;
		this.name = "임하은";
		this.height = 158.9;
		this.gender = '여';
		
	}
	//3.출력메소드
	public void information() {
		System.out.println("학년 : "+ grade);
		System.out.println("반: "+ classroom);
		System.out.println("이름 :"+ name);
		System.out.println("키 : "+ height + "cm");
		System.out.println("성별 : "+ gender);
	}
}
