package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice {

	public static void main(String[] args) {
		// �Ҽ����ϱ�
		
		//1.����ڷκ��� �Է¹��� ���ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		Scanner scan = new Scanner(System.in); //�Է� �ޱ� ���� �ҷ����� �޼ҵ�
		System.out.println("���ڸ� �Է����ּ���.");//��� �޼ҵ�
		int num = scan.nextInt();
		
		int count =1; //count�� 1�� �ʱ�ȭ �Ҽ��� �ƴ� ������ ��Ÿ��
		
	
		//��, �Է��� ���� 2���� ���� ��� "�߸� �Է��ϼ̽��ϴ�."����ϼ���
		if (num<2) {//�Է��� ���� 2���� ���� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {//���࿡ �Է��� ���� 2���� ū ���
			for(int i=1; i<=num; i++) {//2���� �Է¹��� ���� num ������ �ݺ��� �Ҽ��� ã�� ����
				if (num%i==0) {
					
					
				}
			}
		}
		//3.'�Ҽ�'�� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n ���� ���� ���Ѵ�.
		//ex)2,3,5,7,11
		//ex)����:5 ����: 9 ����:0
		//4.�Ҽ��Դϴ�. �Ҽ��� �ƴմϴ�. �߸� �Է��ϼ̽��ϴ�.
		//�Ҽ����� �ƴ��� �Ǻ��ϴ� boolean
		boolean checkNum = true; //�Ҽ� ���θ� �Ǵ��ϱ� ���� boolean���� checkNum �ʱ�ȭ ó������ �Ҽ��� ����
		for(int i =2; i<=num; i++) {
			for(int a = 2; a*a <=i; a++) {//�Է¹��� ���ڰ� �ƴ� ���� ���� i�� �Ҽ����� �Ǵ��ϱ� ���� �ݺ���
				/*i/1�ؾ��� ��� a*a��� �־��
				 * ���� i�� �Ҽ����� Ȯ���Ϸ��� 2���� i-1 ���� ��� ���ڷ� i�� ������ ��� 
				 * a*a ����ϴ� ���� : 
				 * ���� i�� � ����a �� ������ �������ٸ� i�� a�� ������ i/a ���� i�� ��� �� �ϳ�
				 * �̶� i�� a���� ū ���ڷ� �������� �� �̹� a�� �������� �ʱ⶧���� i/a�� i/a���� ū ���ڷ� ������������� ����
				 * a�� i�� ������ i/a���� i�� ����̰�, a�� i/a�� ���� �ٸ� ���� 
				 * i�� �Ҽ����� �Ǻ��ϱ� ���� 2���� i-1���� ��� ���� ��� 2���� sqrt(i)������ ���ڷθ� �������� �Ҽ����θ� �Ǵ��� �� ����.
				 * a*a�� ����ϴ� ���� �Ҽ� �Ǻ� �˰������� ����ȭ�ϱ� ���� ���Ǵ� ���
				 * sqrt(i) : i�� �������� ��Ÿ���� �Լ�
				 * sqrt(16)����� 4�� �� 16�� �������� 4��� ��,
				 *  �Ҽ��Ǻ� sqrt(i) �Ҽ��� �Ǻ��� �� i�� �Ҽ����� Ȯ���ϱ� ���� 2���� sqrt(i)�� ��귮�� ���̰� ȿ�������� �Ҽ��� �Ǻ��� �� ����
				 */
				//���� �Ҽ��� �ƴҰ��
				if(i%a ==0) {
					checkNum =false;
					count++;
					break;
				}
				if(checkNum){
					//�Ҽ��϶� ���� ���
					System.out.println(i); //��� �޼ҵ� �ۼ�
				}
				checkNum = true;
			}
			System.out.println("�Ҽ��� �� ���� : "+(num -count)); //��� ���� �˻簡 ���� ��, �Ҽ��� �ƴ� ���� ������ ���� �� ������ �����
		}
		

	}

}