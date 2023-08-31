package com.kh.Practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu ; 
		System.out.println("1.입력  2.수정  3.조회 4. 삭제  7.종료" );
		System.out.print("메뉴 번호를 입력하세요.");
		menu = scan.nextInt();
		
		/**1.if문**/
		/*
		if (menu == 1) {
			System.out.println("입력");
		}else if(menu ==2) {
			System.out.println("수정");
		}else if(menu ==3) {
			System.out.println("조회");
		}else if(menu ==4) {
			System.out.println("삭제");
		}else if(menu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
		
		*/
		
		/**2.switch문**/
		
		switch (menu) {
			
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정  메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회  메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7 :
			System.out.println("종료  메뉴입니다.");
			break;
		default :
			System.out.println("올바르지 않은 번호입니다.");
		}
	}

}
