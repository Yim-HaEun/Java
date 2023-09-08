package com.kh.pattern.mvc.Model;
/*1. 학생 정보 표현
 * private 이름 나이
 * getter setter 만들기
 * */
public class UserModel {

	private String name;
	private int age;
	
	public void setStdName(String name) {
		this.name = name;
	}
	public void setStdAge(int stdAge) {
		this.age = age;
	}

	public String getStdName() {
		return name;
	}

	public int getStdAge() {
		return age;
	}
	

	public UserModel(String name, int age) {
		
		

	}

}
