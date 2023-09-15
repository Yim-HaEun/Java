package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Practice_Resize {

	public static void main(String[] args) {
		//이미지하나 불러오기
		//바탕화면에 새로운 폴더 만들기 mkdir
		//새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더안에 저장하기
		String path = "C:\\Users\\user1\\Desktop\\cute1";
		String inputImg = path + "cutecute.png";
		String outputImg = path + "reSizecute.png";
		
		
		File folder = new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		
		//리사이즈할 이미지 크기 설정
		int width = 200; //가로길이
		int height =150; //세로길이
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			ImageIO.write(bufResizeImg, "png" , new File(outputImg));
			System.out.println("이미지 리사이즈 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 실패"+ e.getMessage());
			e.printStackTrace();
		}
				

	}

}
