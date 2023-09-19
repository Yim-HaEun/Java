package com.kh.PracticeGraph;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		int ver = 8; //그래프 노드의 수를 5로 정의
		Graph graph = new Graph(ver);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 5);
		graph.addEdge(2, 6);
		graph.addEdge(3, 7);

		System.out.println("DFS 탐색 결과 : ");
		graph.DFS(0);

	}

}
