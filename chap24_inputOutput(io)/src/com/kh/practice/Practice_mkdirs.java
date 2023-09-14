package com.kh.practice;
/*폴더 연속으로 2개 만들기C:\Users\\user1\Desktop\이름1\이름2
//폴더 연속으로 3개 만들기C:\Users\\user1\Java_Workspace\chap25_
폴더 연속으로 5개 만들기C:\Users\\user1\Desktop\myplace\Music\Korean\KPop\Group
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		//pm.Practice2();
		//pm.Practice3();
	}
	public void Practice1() {
		
		String folderPath = "C:\\Users\\user1\\Desktop\\name1\\name2";
		
		File folder = new File(folderPath);
		boolean success = folder.mkdir();
		if(success) {
			System.out.println("폴더 생성 성공");
		}else {
			System.out.println("폴더 생성 실패");
	}
		
		
			
	
	public void Practice2() {
		String fPath = "C:\\Users\\\\user1\\Java_Workspace\\Chap25";
		File folder = new File(fPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		try {
			FileWriter writer = new FileWriter("C:\\Users\\user1\\Java_Workspace\\Chap25\\pr1\\pr2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Practice3() {
String folderPath = "C:\\Users\\user1\\Desktop\\myplace\\Music\\kop";
		
		File folder = new File(folderPath);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\myplace\\Music\\kop\\group.txt");
			w.write("NCT");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}


