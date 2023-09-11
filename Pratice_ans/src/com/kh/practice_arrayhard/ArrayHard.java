package com.kh.practice_arrayhard;

import java.util.Scanner;

public class ArrayHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int numRows = scan.nextInt();
		scan.nextLine(); //개행문자 제거
		
		int[][] charArray = new int[numRows][];
		//그 수만큼의 반복을 통해
		for(int i=0; i< numRows; i++) {
			//열의 크기도 받아
			System.out.println(i + " 열의 크기 받기 : ");
			int numCols = scan.nextInt();
			charArray[i] = new int[numCols];
			
			int StartValue = i *numCols +1;
			for(int j =0; j < numCols; j++) {
				charArray[i][j] = StartValue;
			}
			//출력하세요.
			//배열 출력
			for(int a =0; a<numRows; a++) {
				for(int b = 0; b<charArray[a].length; b++) {
					System.out.println((char)('a'+ charArray[a][b]-1));
				}
				System.out.println();
			}
			scan.close();
		}
	}

}
