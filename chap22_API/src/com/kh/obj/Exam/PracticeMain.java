package com.kh.obj.Exam;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		
		p.practice1();
		p.practice2();
		p.practice3();

	}
	public void practice1() {
		//¹®ÀÚ¿­ »ğÀÔ isert()
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer st = new StringBuffer(str);
		st.insert(10,"¼Ò°í±â");
		System.out.println(st.toString());
	}
	public void practice2() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer st = new StringBuffer(str);
		st.replace(3,5,"Á¡½É");
		System.out.println(st.toString());
		
		
	}
	public void practice3() {
		//¹®ÀÚ¿­ »èÁ¦ delete()
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer st = new StringBuffer(str);
		st.delete(0,2);
		System.out.println(st.toString());
		
	}

}
