package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "����";
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("�ȳ��ϼ��� " + name+ "�Դϴ�. ���� "+ hour+"�ÿ� ��۵˴ϴ�.");
		System.out.println("���� ������ " + score+"�Դϴ�." );
		System.out.println(score+ "�� " + grade +" �����Դϴ�.");
		
		//������ �̸��� ���̿� �ڽ��� ���� (double)�� �ֱ�
		String myName = "������";
		int myAge = 25;
		double myScore = 90.5;
		char myGrade = 'A';
		
		System.out.println("�� �̸��� "+myName+"�Դϴ�. ���� ���̴�" +myAge +"�̰� �� ������" + myScore+"�̸�" +myGrade +"����Դϴ�.");
		
	}
}