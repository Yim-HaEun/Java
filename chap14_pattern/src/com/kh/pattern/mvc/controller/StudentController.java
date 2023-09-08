package com.kh.pattern.mvc.controller;
/*
 * 모델과 뷰를 연결하는 곳
 * 사용자 입력을 처리하는 곳
 */

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;
//import com.kh.pattern.mvc.View.;

public class StudentController {
	//StudentModel
	//StudentView
	
	private StudentModel studentmodel;
	private StudentView studentview;
	
	public StudentModel getStudentmodel() {
		return studentmodel;
	}
	public void setStudentmodel(StudentModel studentmodel) {
		this.studentmodel = studentmodel;
	}
	public StudentView getStudentview() {
		return studentview;
	}
	public void setStudentview(StudentView studentview) {
		this.studentview = studentview;
	}
	public StudentController(StudentModel studentmodel, StudentView studentview){
		this.studentmodel = studentmodel;
		this.studentview = studentview;
		
	}
	public void setSudentName(String name) {
		studentmodel.setName(name);
	}
	public void setStudentAge(int Age) {
		studentmodel.setAge(Age);
	}
}
