package com.kh.api.exam1;

public class ReplaceMain {
	

	
	public static void main(String[] args) {
		ReplaceMain rp = new ReplaceMain();
		rp.replace();
		rp.replace2();
		rp.replace3();
		rp.replace4();
		rp.replace5();
		rp.replaceAll();
	}
	public void replace() {		
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	
	}
	public void replace2() {
		String input1 = "Hello World!";
		//World를 Java로 교체
		String reinput1 = input1.replace("World", "Java");
		System.out.println("수정 : "+ reinput1);
	}
	public void replace3() {
		String originName = "Hello world";
		System.out.println(originName);
		//o로 적혀있는 문자열들 x로 변경하기
		String reOriginName = originName.replace("o","x");
		System.out.println("수정 : " + reOriginName);
		
	}
	public void replace4() {
		//fox 를 cat으로 바꾸기
		String originString = "The quick brown fox jumps over the lazy dog";
		System.out.println(originString);
		String reOriginString = originString.replace("fox", "cat");
		System.out.println("수정: " + reOriginString);
		
	}
	public void replace5() {
		//모든 공백 제거
		String originString = "The quick brown fox jumps over the lazy dog";
		System.out.println(originString);
		String reOriginString = originString.replace(" ", "");
		System.out.println("공백 제거 : "+ reOriginString);
		
	}
	public void replaceAll() {
		String originString = "Hello World";
		//replace대신 replaceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world","black Cat");
		System.out.println("문자열 치환 : "+ reAllstr);
	}

}
