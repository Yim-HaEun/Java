package com.kh.practice.array;
import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		/*사용자가 배열의 길이를 직접 입력하여 
		 * 그 값만큼 정수형 배열을 선언 및 할당하고 
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 
		 * 각각의 인덱스에 값을 초기화 하세요. 
		 * 그리고 배열 전체 값을 나열하고
		 *  각 인덱스에 저장된 값들의 합을 출력하세요*/ 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int arrSize = scan.nextInt();
		int [] arr = new int[arrSize]; //  그 값만큼 정수형 배열을 선언 및 할당하고 
		int sum =0;
		for(int i =0; i <arr.length; i++) {
			System.out.print("배열 "+ i +"번째 인덱스에 넣을 값 : " );
			int num = scan.nextInt();
			arr[i] = num;
			sum += arr[i];
			
		}
		for(int j =0; j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		System.out.println("");
		System.out.println("총합 : "+ sum);	
		
	}
	

}
