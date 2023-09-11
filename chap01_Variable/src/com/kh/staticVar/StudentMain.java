package com.kh.staticVar;

public class StudentMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh");
		//System.out.println(stKim.serialNum);
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2ÇÐ»ý");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		
		System.out.println(khLee.serialNum);
	}

}
