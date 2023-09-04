package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice {

	public static void main(String[] args) {
		// 소수구하기
		
		//1.사용자로부터 입력받은 ㅇ하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		Scanner scan = new Scanner(System.in); //입력 받기 위해 불러오는 메소드
		System.out.println("숫자를 입력해주세요.");//출력 메소드
		int num = scan.nextInt();
		
		int count =1; //count를 1로 초기화 소수가 아닌 개수를 나타냄
		
	
		//단, 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."출력하세요
		if (num<2) {//입력한 수가 2보다 작은 경우
			System.out.println("잘못 입력하셨습니다.");
		}else {//만약에 입력한 수가 2보다 큰 경우
			for(int i=1; i<=num; i++) {//2부터 입력받은 숫자 num 까지의 반복문 소수를 찾는 역할
				if (num%i==0) {
					
					
				}
			}
		}
		//3.'소수'는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n 뿐인 수를 말한다.
		//ex)2,3,5,7,11
		//ex)숫자:5 숫자: 9 숫자:0
		//4.소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.
		//소수인지 아닌지 판별하는 boolean
		boolean checkNum = true; //소수 여부를 판단하기 위한 boolean변수 checkNum 초기화 처음에는 소수로 가정
		for(int i =2; i<=num; i++) {
			for(int a = 2; a*a <=i; a++) {//입력받은 숫자가 아닌 현재 숫자 i가 소수인지 판단하기 위한 반복문
				/*i/1해야할 경우 a*a대신 넣어라
				 * 숫자 i가 소수인지 확인하려면 2부터 i-1 까지 모든 숫자로 i를 나누는 방식 
				 * a*a 사용하는 원리 : 
				 * 만약 i가 어떤 숫자a 로 나누어 떨어진다면 i가 a의 배수라면 i/a 역시 i의 약수 주 하나
				 * 이때 i를 a보다 큰 숫자로 나눠봤을 때 이미 a로 떨어지지 않기때문에 i/a와 i/a보다 큰 숫자로 나누어떨ㄷ어지지 않음
				 * a가 i의 약수라면 i/a역시 i의 약수이고, a는 i/a는 서로 다른 숫자 
				 * i가 소수인지 판별하기 위해 2부터 i-1까지 모든 숫자 대신 2부터 sqrt(i)까지의 숫자로만 나눠봐도 소수여부를 판단할 수 있음.
				 * a*a를 사용하는 것은 소수 판별 알고리즘을 최적화하기 위해 사용되는 방법
				 * sqrt(i) : i의 제곱근을 나타내는 함수
				 * sqrt(16)결과가 4가 됨 16의 제곱근이 4라는 뜻,
				 *  소수판별 sqrt(i) 소수를 판별할 때 i가 소수인지 확인하기 위해 2부터 sqrt(i)의 계산량을 줄이고 효율적으로 소수를 판별할 수 있음
				 */
				//만약 소수가 아닐경우
				if(i%a ==0) {
					checkNum =false;
					count++;
					break;
				}
				if(checkNum){
					//소수일때 값을 출력
					System.out.println(i); //출력 메소드 작성
				}
				checkNum = true;
			}
			System.out.println("소수의 총 갯수 : "+(num -count)); //모든 숫자 검사가 끝난 후, 소수가 아닌 수의 개수를 빼서 총 개수를 출력함
		}
		

	}

}
