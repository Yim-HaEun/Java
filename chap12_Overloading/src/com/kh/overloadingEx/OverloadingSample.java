package com.kh.overloadingEx;

public class OverloadingSample {


	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public double doubleSum(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// 오버로딩 5개 만들고 메서드 5개 출력
		OverloadingSample obj = new OverloadingSample();
		
		System.out.println("두 수의 합 : "+obj.sum(10, 5));
		System.out.println("두 수의 차 : "+obj.sub(10, 5));
		System.out.println("두 수의 곱 : "+obj.mul(10, 5));
		System.out.println("두 수의 나눗셈 : "+obj.div(10, 5));
		System.out.println("두 실수의 합 : "+obj.doubleSum(10, 5));
		
		
		
		

	}

}
