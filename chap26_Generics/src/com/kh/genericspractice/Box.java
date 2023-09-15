package com.kh.genericspractice;

public class Box<B> {
	B content;
	
	public void put(B item) {
		this.content = item;
	}
	public B get() {
		return content;
	}

}
