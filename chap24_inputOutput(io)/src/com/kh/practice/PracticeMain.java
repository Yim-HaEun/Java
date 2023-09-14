package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();

	}
	public void practice1() {//경로설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\Filename.txt");
			w.write("파일입니다.");//파일 쓰기
			w.close();//파일 닫기
			
			//어기서 보던지 경로가 확실한 경로 = 절대경로
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\Filename.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일 만들기
		//파일 안에 내용 작성하기
		String folderPath = "C:\\Users\\user1\\Desktop\\newFolder";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		
		try {
			FileWriter f = new FileWriter("C:\\Users\\user1\\Desktop\\newFolder\\info.txt");
			f.write("정보입니다.");
			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
