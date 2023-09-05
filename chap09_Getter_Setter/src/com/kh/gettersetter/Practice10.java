package com.kh.gettersetter;

public class Practice10 {

	public static void main(String[] args) {
		// 주민번호 성별 이후 *로 출력
		
		//1.주민번호 만들기
		String jumin = "123456-1234567"; //14자리
		
		//2.성별자리 이후 별표 만드는거 만들기
		String makeStar = "*";
		//주민등록번호 성별자리 이후부터 *로 가리고 출력
		//to char Array를 사용해서 String > char Array로 변경
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		for(int i = 8; i<juminStar.length; i++ ){//주민번호 9자리부터 끝자리까지 *표 처리하기
			juminStar[i] = '*';
			//juminStar 9자리가 시작하면 *로 바꾸자.
			
		}System.out.println(juminStar);
			
		
	}

}
