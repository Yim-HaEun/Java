package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		int i = 1;
		while (i <= 10) { //숫자가 5가 될때 출력을 멈추고 싶어
							//i가 5보다 같거나 작을 때 true
			System.out.println(i); // 위 부등호가 참일 경우
			i = ++i; //2 i++;/ i = i+1;
			//i++ 일때 i가 1인 값을 먼저 대입했기때문에 ++가 작동하지 않았다.(무한루프 발생)
			//++i일 때는 i에 +1을 먼저 대입 
			//1~10까지 출력 가능, 무한루프 발생X
		}
		
	}

}
