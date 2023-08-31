package com.kh.whilesample;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		boolean isChoice = false;
		while (!isChoice) { //!를 사용하여 true로 표기
			System.out.println("계절을 선택해주세요.");
			
			int month = scan.nextInt();
			
			switch(month){
			
			case 12: case 1: case 2: //case 3개 중 하나라도 참이면 출력
				System.out.println("겨울");
				isChoice = true; // 위 !가 있을 경우 참은 거짓으로 변경되고, 
				//거짓은 참으로 변경되기 때문에 true로 작성해주어 !를 만나 false로 변경해 while문을 종료해준다.
				break; //break는 case문에서 실행하고자 하는게 종료된 후 한 번만 사용한다.
			case 3: case 4: case 5:
				System.out.println("봄");
				isChoice = true;
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				isChoice = true;
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				isChoice = true;
				break;
			default:
				System.out.println(month+ "월은 잘못된 월입니다.");
			}
			
		}

	
	
	
	/*나이를 입력받아 성인(19~20) 청소년(14~15) 어린이(10~13)로 분류하고 출력하기
	 * While switch case 이용해서 출력하기
	 * case 문을 
	 * 이외 나이는 다시 입력하세요. 놀이공원 입장표를 9살 이상만 구매할수 있기 때문
	 * */
		boolean choice = false;
		while(!choice) {
			System.out.print("놀이공원 입장권을 구매하기 위한 당신의 나이를 입력해주세요.");
			int age = scan.nextInt();
			switch(age) {
			case 19: case 20:
				System.out.println("성인 입장권 구매하기");
				choice = true;
				break;
			case 14: case 15:
				System.out.println("청소년 입장권 구매하기");
				choice = true;
				break;
			case 10: case 11: case 12: case 13:
				System.out.println("어린이 입장권 구매하기");
				choice = true;
				break;
			
			default:
				System.out.println("나이를 다시입력하세요.");
				
			}
	}
	}

}
