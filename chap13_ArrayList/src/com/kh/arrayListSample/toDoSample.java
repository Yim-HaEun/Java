package com.kh.arrayListSample;
import java.util.ArrayList;
public class toDoSample {

	public static void main(String[] args) {
		// ArrayList이용해서 
		//할일 만들고(3개
		//수정하고 (2개
		//지우고(1개
		//전부 다 삭제하기
		
		ArrayList<String> todo = new ArrayList<>();
		//할일 만들기
		todo.add("오펜하이머 예매하기");
		System.out.println("ToDo List +: "+ todo);
		todo.add("반복문 hard 문제풀기");
		System.out.println("ToDo List +: "+ todo);
		todo.add("헬스장 가기");
		System.out.println("ToDo List + : "+ todo);
		
		//수정하기
		todo.set(0,"다른영화 예매하기");
		todo.set(1,"심화문제 다 풀기");
		System.out.println("ToDo List (수정됨): " + todo);
		
		//지우기
		todo.remove(0);
		System.out.println("남은 할 일 : " + todo);
		
		//ArrayList 순회해서 요소출력
		for(String aaaaa : todo) {
			System.out.println("할 일 목록 : " + todo);
		}
		//중복된 할일 제거
		//전부 다 지우기
		todo.clear();
		System.out.println("ToDo List 삭제되었습니다." + todo);
	}

}
