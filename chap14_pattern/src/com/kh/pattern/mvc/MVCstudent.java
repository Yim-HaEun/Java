package com.kh.pattern.mvc;

public class MVCstudent {
	//1.model
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
		
		
	}public int getAge() {
		return age;
	}

	public MVCstudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//2.Controller
	public class SController{
		private MVCstudent model;
		private MVCstudent view;
		
		public SController() {
			this.model = model;
			this.view = view;
		}
		public void updateView() {
			view.printInfo();
		}
	}
	
	//3.view
	public void printInfo() {
		System.out.println("학생들의 정보");
	}
	//etc.Client
	public static void main(String[] args) {
		
		

	}

}
