package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		int port = 3333;
	
		ServerSocket server;
	
		server = new ServerSocket(port);
		System.out.println("서버가 포트 "+ port + "에서 실행 중입니다.");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("connect Client" + client.getInetAddress());
			//Buffered
			/*
			OutputStream outStream = client.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("클라이언트 안녕!");
			System.out.println("server | client ");
			printStream.flush();
			*/
			client.close();
		}
	}
}