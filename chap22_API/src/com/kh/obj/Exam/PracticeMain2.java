package com.kh.obj.Exam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2  st = new PracticeMain2();
		st.practice1();
		st.practice2();

	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ºÙÀÌ±â Ãâ·Â append()
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³áÀº ¹¹¸ÔÁö ?");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse()
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		str.reverse();
		System.out.println(str.toString());
	}

}
