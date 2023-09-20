package com.kh.iAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		PracticeAddress inetPractice = new PracticeAddress();
		inetPractice.InetPractice();
	
	}
	public void InetPractice() {
		try {
			//호스트의 이름 이용해서 객체 생성
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP 주소 출력
			System.out.println("Host Name : "+ address.getHostName());
			System.out.println("Host Name : "+ address.getHostAddress());
			
			//내 컴퓨터의 InetAddress 객체 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : "+ localHost.getHostName());
			System.out.println("Local IP Address : "+ localHost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
