package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는 데 사용
 		java 1.1이후로는 권장되지 않음
 			java.time 패키지 LocalDate LocalTime LocalDateTime
 * */
	
	public static void main(String[] args) {
		//import java.util.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println("지금 시간 : " + nowTime);
		
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : "+nowDT);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : "+futureDate);
		
		//minus plus
		LocalDate today1 = LocalDate.now();
		LocalDate pastDate =today.minusDays(7);
		System.out.println("7일 전 날짜 : " + pastDate);
		LocalDate today2 = LocalDate.now();
		LocalDate pastmonth =today.minusMonths(1);
		System.out.println("한달 전 날짜 : " + pastmonth);
		
		LocalDate today3 = LocalDate.now();
		LocalDate futureMonth = today.plusMonths(1);
		System.out.println("한달 뒤 날짜 : "+ futureMonth);
		LocalDate today4 = LocalDate.now();
		LocalDate futureWeeks = today.plusWeeks(3);
		System.out.println("3주 뒤 날짜 : " + futureWeeks);
		
		LocalTime nowTime1 = LocalTime.now();
		LocalTime laterTime = nowTime1.plusHours(3);
		System.out.println("");
		
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 8, 13);
		//date1.isBefore(date2)
		if(date1.isBefore(date2) == true) {
			System.out.println("date1이 더 빠른날입니다.");
		}else if(date1.isAfter(date2)== true) {
			System.out.println("date1이 더 나중입니다.");
			//출력메소드
		}else {
			//출력메소드
			System.out.println("같은 날짜입니다.");
		}
		
	
	}

}
