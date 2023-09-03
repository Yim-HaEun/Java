package com.kh.hw.controller;
import java.util.*;
public class Function {

	
	public void calculator() { //	과제3
		/*정수 두 개와 연산자 하나를 키보드로 입력 받아 
		 * 두 정수는 int변수에, 연산문자는 char에 저장 
		 * 연산문자가 +이면 두 정수의 합 계산, 
		 * -이면 두 정수의 차 계산, 
		 * x 또는 X이면 두 정수의 곱,
		 * /이면 두 정수의 나누기 몫이나 나누는 수(두 번째 수)가 0이면 “0으로 나눌 수 없습니다.” 출력하고 결과 값은 0으로 처리
		 * */
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("첫 번째 정수 : ");
		int a = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = scan.nextInt();
		System.out.print("연산자(+, -, x, / : ");
		char m = scan.next().charAt(0);
		
		if(m == '+') {
			System.out.println(a + "+" + b + "="+ (a+b));
		}
		else if(m == '-') {
			System.out.println(a + "-" + b + "="+ (a-b));
		}else if(m == '*') {
			System.out.println(a + "*" + b + "="+ (a*b));
		}
		else if(m == '/') {
			if(a==0 || b==0) {
				System.out.println("0 으로 나눌 수 없습니다.");
			}
			System.out.println(a + "/" + b + "="+ (a/b));
		}
	}
	
	
	public void totalCalculator() {//과제4
		//키보드로 정수 두개를 입력 받아
		//두 정수 중 작은 값을 시작 값으로 큰 값을 종료값으로 사용
		//작은 값에서 큰값까지 합계를 구함 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int sum =0;
		for(int i = min; i<=max;i++) {
			sum+=i;
		}
		System.out.println(min + "부터 " + max + "까지 정수들의 합 : " + sum );
	}
	
	public void printProfile() { //과제5
		//신상 정보들을 자료형에 맞춰 변수에 기록하고 변수에 기록된 값 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.println(name);
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.println(gender);
		
		System.out.print("성격 : ");
		String character = scan.next();
		System.out.println(character);
	}
	
	
	public void printScore() { //과제6
		//키보드로 입력 받은 값들을 변수에 기록하여 변수 값을 화면에 출력
		//점수가 90점 이상이면 A학점, 80이상 90미만이면 B,
		//70이상 80미만이면 C, 60이상 70미만 D, 60미만 F학점을 매김
	
	Scanner scan = new Scanner(System.in);
	char scoreG;
	System.out.print("이름 : ");
	String name = scan.next();
	
	System.out.print("학년 : ");
	int grade = scan.nextInt();
	
	System.out.print("반 : ");
	int classN = scan.nextInt();
	
	System.out.print("번호 : ");
	int num = scan.nextInt();
	
	System.out.print("성별(M/F) : ");
	String gender = scan.next();
	if(gender == "F") {
		gender = "여학생 ";
	}else {
		gender = "남학생";
	}
	
	System.out.print("성적 : ");
	double score = scan.nextInt();
	if(score>=90) {
		scoreG = 'A';
		
	}else if(score<90 && score>=80) {
		scoreG = 'B';
	}else if(score>=70 && score<80) {
		scoreG = 'C';
	}else if(score>=60 && score<70) {
		scoreG = 'D';
	}else {
		scoreG = 'F';
	}
		
	
	System.out.println(grade +"학년 " + classN+ "반 "+ num + "번 " + gender + name + "의 점수는 "+ score+"이고 "+ scoreG + "학점입니다.");
	
	}
	
	
	
	public void printStarNumber() {//과제7
		Scanner scan = new Scanner(System.in);
	
		System.out.print("정수 : ");
		int n = scan.nextInt();
		
		if(n>0) {
			for(int i =1; i<=n;i++) {
				for(int j = 0; j<n; j++) {
					System.out.print("*"); // 별 
				}
				System.out.print(i);//숫자 출력 
			}
			
			
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	
	
	public void sumRandom() { // 과제 8
		//1부터 100 사이의 정수 중 임의의 정수하나를 발생시켜
		//1부터 랜덤 수까지의 합계 출력 
		
		Random rand = new Random();
		int r = rand.nextInt(100)+1;
		int sum = 0;
		
		for(int i = 1; i<=r; i++) {
			sum +=i;
		}
		
		System.out.print("1부터"+ r + "까지의 합: " + sum);
	}
	
	
	
	public void exceptGugu() { //과제 9
		//정수를 하나 입력 받아 그 수가 양수일 때만
		//그 수의 구구단 출력
		//단 곱하기 수가 입력 받은 단의 배수일 경우 출력 제외
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		if(num > 0) { //양수라면,
			for(int i =1; i<=9; i++) {
				if(num%i != 0) { // 배수 출력 제
					System.out.println( num + "*" + i + "=" +num*i);
				}else {
					continue;
				}
				
			}
			
		}else { // 양수가 아니면 출력 X
			System.out.println("");
		}
	}
	
	
	public void diceGame() {
		/*
		 두 개의 주사위가 만들어낼 수 있는 모든 경우의 수를 랜덤으로 정하고
		랜덤으로 정해진 두 주사위 눈의 합이 입력된 수와 같은 경우 “맞췄습니다“ 출력,
		입력 값과 다르면 “틀렸습니다“ 출력하여 맞출 때까지 반복
		값을 맞추면 “계속 하시겠습니까? (y/n) : “가 출력되고
		‘y’ 또는 ‘Y’ 입력 시 새로운 랜덤 수가 정해지고 처음부터 다시 시작,
		 ‘n’ 또는 ‘N’ 입력 시 종료
		  */
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int dice1 = rand.nextInt(6)+1; // 주사위 던지기1 
		int dice2 = rand.nextInt(6)+1; //주사위 던지기 2
		
		
		int sum = dice1 + dice2;
		boolean isTrue = false;
		while(!isTrue) {
			System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력 : ");
			int guess = scan.nextInt();
		
			if(guess == sum) {// 정답이 맞으면 
				System.out.println("정답입니다. ");
				System.out.println("주사위의 합 : " + sum);
				System.out.println("계속하시겠습까? (y/n)"); 
				
				char yn = scan.next().charAt(0); // 입력받기 
				if(yn == 'y') {//계속하기를 선택 
					isTrue = false; //반복문을 나가지 않는다.
				}else if(yn == 'n') { // 그만 둔다
				isTrue = true; // 반복문을 나간다.
				break;
				}
			}else {//정답이 아니면
				System.out.println("틀렸습니다. ");
			}
		}
		
		
	}


}
