package com.kh.finalSample;

import java.util.ArrayList;

public class MyMusic {
	public void runFruit() {
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("NCT U", "Baggy Jeans"));
		list.add(new Music("Travis Scott", "My Eyes"));
		//list.add("À½¾Ç");
		
		for(int i =0; i <=list.size(); i++) {
			Music m = list.get(i);
			System.out.println(m.getG()+ ", " + m.getMood());
		}
	}

}
