package com.kh.instance.tv;
//TV 제작 
public class Tv {

	//TV 속성(필드)
	String color; //티비 색상
	boolean power; // 전원 상태
	int channel;
	//TV 기능(메서드)
	public void power() {
		power = !power; //전원 상태
		
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}

}
