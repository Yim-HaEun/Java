package com.kh.fileIO;

import java.io.File;

public class FileDeleteMain {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\DeskTop\\";
		String originFile = mainPath + "RealCute.jpg";
		//파일 객체 생성
		File fileToDelete = new File(originFile);
		
		//파일 삭제
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("파일이 성공적으로 삭제되었습니다.");
		}else {
			System.out.println("파일을 삭제하는데 실패했습니다.");
		}

	}

}
