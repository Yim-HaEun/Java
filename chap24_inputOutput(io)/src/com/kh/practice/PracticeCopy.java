package com.kh.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy c = new PracticeCopy();
		c.practice1();
		//c.practice2();
	}
	public void practice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.jpg";
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일 복사 완료");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		
		newFolder.mkdir();
		
		String outputFile = inputFile + "\\"+"cute1.png";

		// 이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후
		//바탕화면에다가 폴더를 만들어서
		//폴더 안에 복사한 이미지 저장하기!
	}

}
