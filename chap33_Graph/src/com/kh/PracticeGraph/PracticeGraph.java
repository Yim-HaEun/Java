package com.kh.PracticeGraph;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		int ver = 8; //�׷��� ����� ���� 5�� ����
		Graph graph = new Graph(ver);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(3, 7);

		System.out.println("DFS Ž�� ��� : ");
		graph.DFS(0);

	}

}
