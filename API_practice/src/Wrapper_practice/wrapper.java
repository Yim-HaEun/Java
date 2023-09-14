package Wrapper_practice;

import java.nio.charset.Charset;

public class wrapper {

	public static void main(String[] args) {
		//String을 기본 자료형으로 바꾸기
		Byte b = Byte.parseByte("1");

		Short s = Short.parseShort("2");

		Integer i = Integer.parseInt("3");

		Long l = Long.parseLong("4");

		Float f = Float.parseFloat("0.1");

		Double d = Double.parseDouble("0.2");

		Boolean bool = Boolean.parseBoolean("true");

		char c = "abc".charAt(0);
		
		
		//기본 자료형을 String으로 바꾸기
		String b1 = Byte.valueOf((byte)1).toString();

		String s1 = Short.valueOf((short)2).toString();

		String i1 = Integer.valueOf(3).toString();

		String l1 = Long.valueOf(4L).toString();

		String f1 = Float.valueOf(0.1f).toString();

		String d1 = Double.valueOf(0.2).toString();

		String bool1 = Boolean.valueOf(true).toString();

		String ch1 = Character.valueOf('a').toString();
		
		
		System.out.println(".\t.");//정해진 공간만큼 띄어쓰기
		System.out.println("줄\n 바꿈");//출력하고 다음 라인으로 옮김
		//특수문자 사용 시 백 슬래시(\)를 넣고 특수문자를 넣어야 함
		System.out.println("\\");
		System.out.println("\'");
		System.out.println("\"");

	}

}
