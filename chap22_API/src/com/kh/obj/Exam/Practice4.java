package com.kh.obj.Exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();

	}
	public void practice1() { //년월일 yyyy -MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String forDate = sdf.format(currentDate);
		System.out.println("년 월 일 : "+ forDate);
	
		
	}
	public void practice2() { //시분초 HH:mm:ss
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		String forDate = sdf.format(currentDate);
		System.out.println("시 분 초 : "+ forDate);
	}
		
	
	public void practice3() {//월일 MM-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		
		String forDate = sdf.format(currentDate);
		System.out.println("월 일 : "+ forDate);
		
	}
	public void practice4() {//연도 시간 yyyy-HH
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		
		String forDate = sdf.format(currentDate);
		System.out.println("연도 시간 : "+ forDate);
	
	}public void practice5() {//날짜-요일 yyyy-dd
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		
		String forDate = sdf.format(currentDate);
		System.out.println("연도 월 일 요일 : "+ forDate);
		
	}
}
