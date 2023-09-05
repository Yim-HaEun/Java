package com.kh.classAM;
//import com.kh.classAm.AM;
public class OtherAM {
	//AM 생성
	public static void main(String[] args) {
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		//am.privateMethod();// private은 같은 클래스 내에서만 접근 가능하다.다른 클래스에 존재하기때문에 출력이 안됨.
	}

}
