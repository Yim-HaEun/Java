package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> fbrand = new ArrayList<>();
		fbrand.add("Bape");
		fbrand.add("Hysteric Glamour");
		fbrand.add("Diesel");
		fbrand.add("Rick Owens");
		fbrand.add("Supreme");
		
		Iterator<String> iter = fbrand.iterator();
		
		while(iter.hasNext()) {
			String fashionb = iter.next();
			System.out.println(fashionb);
		}
		//요소 삭제
		iter = fbrand.iterator();
		while (iter.hasNext()) {
			String fb = iter.next();
			if(fb.equals("Supreme")) {
				iter.remove(); //현재 요소 삭제
			}
			System.out.println(fb);
		}
		System.out.println("삭제 후 출력");
		for(String a: fbrand) {
			System.out.println(a);
		}	
	}
}
