package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		//���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		/*
		 ������ ������ Ÿ���� ���� �������� �� ���� �����ϰ� �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 �迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
		 �������� ������ ���� �ٷ� �� �ֵ��� ������
		 
		 �迭�� ������ 
		 	<�迭�� ���� �� �ʱ�ȭ>
		 	
		 	������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
		
		 
		 
		 Ư¡ :
		 1.������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ� ����
		 			  ���� �Ŀ��� ũ�⸦ ������ �� ����
		 			  
		 2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� �������մϴ�.
		 			  	  ex) intŸ���� �迭�� ��� ��� ����
		 			  	  
		 3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������ 0���� �����ؼ� �迭ũ�� -1������ ���� ������.
		 					�ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ����
		 					ex)�迭 ũ�� = 5�� ��ٸ� index�� 0 ~ 4
		 
		 4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
		
		 */
		
		//intŸ�� �迭 ����
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		System.out.println(score);//[I@5e91993f
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; //index 0~4���� �����
		//�迭�� int 5���� ����
		
		for(int i = 0; i<5; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
			
			
		}
		String[] stringArray = new String[4];
		//String[] stringArray = {"","","",""};
		stringArray[0] = "��";
		System.out.println("String Array[0] : "+ stringArray[0]); //{��}
		
		//String[] nameArray = {"������","ȫ�浿","������"};
		
		String[] food = {"����", "����" ,"����","�Ұ���"}; 
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength);
	}
}