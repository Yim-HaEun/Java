package com.kh.practice.array;
import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고
		//, 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		Scanner scan = new Scanner(System.in);
		
	
		
		int n;
		
		boolean isTrue = false;
		while(!isTrue) {
			System.out.print("정수 : ");
			int num = scan.nextInt();
			
			if(num>=3 && num%2==1 ) {//3이상인 홀수 자연수
				n = (num+1)/2;
				for(int i=1; i<=n; i++) {
					System.out.print(i);
				}	isTrue =true;
				break;
			
			}else {
				System.out.println("다시 입력하세요: ");
				
			}
		}
		
	}
}
