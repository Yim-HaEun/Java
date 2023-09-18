package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterator
	컬렉션(데이터 그룹)을 반복(iterate)하면서 요소에 접근하는데 사용되는 인터페이스
	다양한 컬렉션 유형(ArrayList,HashSet 등)에 사용할 수 있음
	컬렉션의 요소를 읽고 삭제하는데 사용
	컬렉션의 크기나 내부 구조에 관계없이 요소에 접근할 수 있음.
* */
public class IteratorMain {

	
	public static void main(String[] args) {
		// ArrayList 생성 및 요소 추가
		ArrayList<String> music = new ArrayList<>();
		music.add("NCT");
		music.add("Travis Scott");
		music.add("The Weeknd");
		music.add("Harry Styles");
		
		//Iterator 생성
		Iterator<String> iter = music.iterator();
		
		//Iterator를 사용하여 요소 반복
		while(iter.hasNext()) {
			String artists = iter.next();
			System.out.println(artists);
		}
		//Iterator를 사용하여 요소 삭제
		iter = music.iterator(); //다시 Iterator 초기화
		while (iter.hasNext()) {
			String artists = iter.next();
			//만약에 트로트가 들어오면 삭제하길 원함
			if(artists.equals("NCT")) {
				iter.remove(); // 현재 요소 삭제
			}
			System.out.println(artists);
		}
		//삭제 후 ArrayList 출력
		System.out.println("삭제 후 출력");
		for (String a: music) {
			System.out.println(a);
		}

	}

}
