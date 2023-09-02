package com.kh.practice.array;
import java.util.Scanner;
public class practice9 {

	public static void main(String[] args) {
		// 사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 
		//없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		Scanner scan = new Scanner(System.in);
		String[]  chkn = {"후라이드", "양념", "뿌링클" ,"허니"};
		System.out.println("치킨 이름을 입력하세요 : ");
		String choice = scan.next();
		int count =0;
		
		for (int i =0; i<chkn.length; i++) {
			if(choice == chkn[i]) {// 메뉴가 있으면
				count +=1; //count 증가시키
				
			}else {
				System.out.print("");
				
			}
		}
			if (count ==1) {
				System.out.println(choice +"치킨 배달 가능 ");
			}
			else if(count ==0) {
				System.out.println(choice +"치킨은 없는 메뉴입니다.");
			}
		
		
	}

}

