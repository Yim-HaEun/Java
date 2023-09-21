package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		// Array 예제
		String[] inturnArray = {"김경난", "김말똥","홍길동","박철수","임하은"};
		inturnArray[3] = "박한나";
		System.out.println("박철수 대신 " + inturnArray[3]);
		
		/**예제
		 * String[] fruitArray = {"사과", "딸기","키위","메론","귤"};
		 사과에는 바나나
		 딸기에는 수박
		 키위에는 레몬 
		 메론에는 귤
		 귤에는 오렌지
		 */
		 String[] fruitArray = {"사과", "딸기","키위","메론","귤"};
		 fruitArray[0] = "바나나";
		 fruitArray[1] ="수박";
		 fruitArray[2] ="레몬";
		 fruitArray[3] ="귤";
		 fruitArray[4] ="오렌지";
		 for(int i = 0; i<fruitArray.length; i++) {
			 System.out.print(fruitArray[i] + " ");
		 }

	}
	

}
