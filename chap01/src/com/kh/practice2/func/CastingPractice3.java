package com.kh.practice2.func;

public class CastingPractice3 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch =  'A';
		
		System.out.println(iNum1/iNum2); //2
		System.out.println(iNum1%iNum2); //2
		
		System.out.println((double)iNum1);//10.0
		System.out.println(dNum*iNum2);//10.0
		
		System.out.println((double)(iNum1/(double)iNum2));//2.5
		System.out.println(dNum);//2.5
		
		System.out.println((float)iNum1/ fNum);//3.33333
		System.out.println((double)iNum1/ fNum);//3.33333333
		
		System.out.println(ch);//'A'
		System.out.println((int)ch);//65
		System.out.println((int)ch+ iNum1); // 75
		System.out.println((char)(ch + iNum1)); //'K'
		
	}
}
