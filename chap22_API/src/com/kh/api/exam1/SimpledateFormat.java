package com.kh.api.exam1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpledateFormat {
	

	/*
	 SimpleDateFormat 
	 	날짜와 시간을 원하는 형식으로 포매팅하거나 문자열로부터 날짜와 시간을 파싱하는데 사용되는 클래스
	 	yyyy-MM-dd HH:mm:ss
	 	y : 연도
	 	M : 월
	 	d : 일
	 	H : 24시간 형식의 시간
	 	m : 분
	 	s : 초
	 * */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//포맷팅 무
		String forDate = sdf.format(currentDate);
		
		//결과출력
		System.out.println("포맷팅 된 시간: "+ forDate);
		

	}

}
