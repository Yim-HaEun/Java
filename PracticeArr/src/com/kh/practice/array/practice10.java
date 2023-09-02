package com.kh.practice.array;
import java.util.Scanner;
public class practice10 {

	public static void main(String[] args) {
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 
		//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		Scanner scan = new Scanner(System.in);

		String[] numb = {"1","2","3","4","5","6","-","1", "2", "3", "4", "5", "6"};
		System.out.print("주민등록번호(-포함) : ");
		for(int i =0; i< numb.length; i++) {
			System.out.print(numb[i]);
		}
		System.out.println("");
		
		numb[12] = "*";
		numb[8] = "*";
		numb[9] = "*";
		numb[10] = "*";
		numb[11] = "*";
		
		for(int j =0; j< numb.length; j++) {
			System.out.print(numb[j]);
			
		}
		
	}
	
}