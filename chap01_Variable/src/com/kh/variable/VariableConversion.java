package com.kh.variable;

public class VariableConversion {
	
	public static void main(String[]args) {
		//1.자동형변환(암시적형변환,묵시적형변환)
		int intNum = 100; //숫자 100을 의미
		long longNum = intNum; //int를 long으로 자동형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;//float을 double로 자동형변환
		
		
		
		//int ->long 변경하는 형변환 2가지 만들고 출력하기
		int intNum1 = 200;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum3 = 300;
		long longNum3 = intNum3;
		System.out.println(longNum3);
		
		//short -> int 변경하는 형변환 1가지 만들고 출력하기
		short shortNum = 5;
		int intNum2 = shortNum;
		System.out.println(intNum2);
		
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		float floatNum1 = 3.14f;
		double doubleNum1 = floatNum1;
		System.out.println(floatNum1);
		
		//2. 명시적 형변환(강제 형변환)
		//long ->int
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long을 int로 강제형변환 할 경우 값이 범위 안에 있지 않으면 일부데이터는 손실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때는 정수 부분만 유지된다.
		
		//문자와 숫자간의 형변환 2개출력 문자는 char charValue = 'Z'; ->int로 변경
		char charValue = 'Z';
		int intValue = (int) charValue;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		int intValue1 = charValue1;
		System.out.println(intValue1);
		
		//double -> int로 형변환
		double largedouble2 = 3.14;
		int intNum4 = (int) largedouble2;
		System.out.println(intNum4);
		
		//int를 short로 형변환
		
		int intNum5 = -1;
		short shortNum5 = (short) intNum5;
		System.out.println(shortNum5);
	}
}
