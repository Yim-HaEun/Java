package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class practiceMain {

	public static void main(String[] args) {
		//stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		practiceMain pm = new practiceMain();
		//pm.PracticeStack();
		pm.PracticeQueue();
	}
	public void PracticeStack() {
		Stack<String> stack = new Stack<>();
			//값 저장
		stack.push("chocolate");
		stack.push("candy");
		stack.push("jellyBean");			
		stack.push("iceCream");
			
			//값 삭제
		System.out.println(stack.pop());
		System.out.println(stack.pop());
			
			//값 초기화
		stack.clear();
	}
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		//큐에 요소 추가 반환 삭제하고 while 사용하기
		
		queue.offer("쿠엔틴 타란티노");
		queue.offer("크리스토퍼 놀란");
		queue.offer("왕가위");
		queue.offer("스티븐 스필버그");
		queue.offer("매튜 본");
		
		
		String removedElement = queue.poll();
		System.out.println(removedElement);
		
		removedElement = queue.poll(); //놀란 감독 제거
		String frontElement = queue.peek();
		System.out.println(frontElement); //제거하지 않고 확인만
		
		int size = queue.size(); //사이즈 확인
		System.out.println("size : "+ size );
	}
		

}


