package com.kh.example.practice2.model.vo;

public class Circle {
	//�ʵ� �������
	double PI =3.14;
	int radius=1;
	
	//������
	public Circle() { //�⺻ ������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
		
	}
	//�޼��� 
	
	public void incrementRadius() {
		radius++;
		System.out.println("������ : "+ radius);
	
	}
	public void  getAreaOfCircle() {
		System.out.println("���� ���� : " + (PI*radius*radius) );
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� �ѷ� : " + (2*PI*radius));
	}
	
	
	


}
