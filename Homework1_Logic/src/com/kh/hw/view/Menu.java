package com.kh.hw.view;
import java.util.Scanner;
public class Menu {

	public void displayMenu() {
		Scanner scan = new Scanner(System.in);
		
		
		boolean isTrue = false;
		while(!isTrue) {
			System.out.println("1. 간단 계산기");
			System.out.println("2.작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임 ");
			System.out.println("9 프로그램 종료 ");
			System.out.print("메뉴 번호 : ");
			int num = scan.nextInt();
			if(num<=9){
				System.out.println("(메뉴 "+ num + "실행)");
				
			}
			else if(num==9) {
				System.out.println("종료합니다. ");
				isTrue = true;
				break;
				
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
}
