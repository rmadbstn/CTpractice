package ClassQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Node implements Comparable<Node> {

	int end, weight;

	public Node(int end, int weight) {

		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}

}

public class BaekJoon1753_final {

	static int[] distance;
	static int INF = 600000001;
	static int V, E;

	public static void dijkstra(int K, LinkedList<Node>[] list) {

		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] check = new boolean[V + 1];
		
		

		queue.offer(new Node(K, 0));

		while (!queue.isEmpty()) {

			Node curNode = queue.poll();

			int temp = curNode.end;
			if(check[temp]==true) {
				continue;
			}else {
				check[temp ]= true;
			}
			
			
			for (Node endNode : list[curNode.end]) {

				if (distance[endNode.end] > distance[curNode.end] + endNode.weight) {
					distance[endNode.end] = distance[curNode.end] + endNode.weight;
					queue.offer(new Node(endNode.end, distance[endNode.end]));
//					System.out.println(endNode.end);

				}

			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strArr = br.readLine().split(" ");
		V = Integer.parseInt(strArr[0]); // 정점의 개수
		E = Integer.parseInt(strArr[1]); // 간선의 개수

		distance = new int[V + 1];// 최소 가중치 합 저장.

		Arrays.fill(distance, INF);

		LinkedList<Node>[] list = new LinkedList[V + 1];

		for (int i = 1; i <= V; i++) {

			list[i] = new LinkedList<>();

		}

		String str = br.readLine();

		int K = Integer.parseInt(str);// 시작 점 .

		distance[K] = 0;
		for (int i = 0; i < E; i++) {

			String[] strArr2 = br.readLine().split(" ");
			int start = Integer.parseInt(strArr2[0]); // 출발점
			int end = Integer.parseInt(strArr2[1]); // 도착점
			int w = Integer.parseInt(strArr2[2]); // 가중치

			Node node = new Node(end, w);
			list[start].add(node);

		}

		dijkstra(K, list);

		for (int i = 1; i < V + 1; i++) {

			if (i == K) {
				bw.write("0" + "\n");
			} else if (distance[i] == INF) {
				bw.write("INF" + "\n");
			} else {
				bw.write(distance[i] + "\n");

			}
		}
		bw.flush();
		bw.close();
	}

}
