package ClassQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


class Node implements Comparable<Node>{
	
	int end,weight;
	
	public Node(int end,int weight) {
		
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
}



public class BaekJoon1753_final{
	
	
	public static void bfs(int K, LinkedList<Integer>[] list) {

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(K);

		while (!queue.isEmpty()) {

			int cur = queue.poll();

			for (int end : list[cur]) {

				if (dpArr[cur] + wArr[cur][end] >= dpArr[end] && dpArr[end] != 0) {
					continue;
				}

				dpArr[end] = dpArr[cur] + wArr[cur][end];
			
				queue.offer(end);

			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strArr = br.readLine().split(" ");
		int V = Integer.parseInt(strArr[0]); // 정점의 개수
		int E = Integer.parseInt(strArr[1]); // 간선의 개수

		wArr = new int[V + 1][V + 1]; // 두 정점간 가중치.
		dpArr = new int[V + 1];// 최소 가중치 합 저장.

		LinkedList<Integer>[] list = new LinkedList[V + 1];

		for (int i = 1; i <= V; i++) {
			
			list[i] = new LinkedList<>();

		}

		String str = br.readLine();

		int K = Integer.parseInt(str);// 시작 점 .

		for (int i = 0; i < E; i++) {

			String[] strArr2 = br.readLine().split(" ");
			int start = Integer.parseInt(strArr2[0]); // 출발점
			int end = Integer.parseInt(strArr2[1]); // 도착점
			int w = Integer.parseInt(strArr2[2]); // 가중치

			wArr[start][end] = w;
			list[start].add(end);

		}

		bfs(K, list);

		for (int i = 1; i < V+1; i++) {

			if(i==K) {
				bw.write("0"+"\n");
			}else if(dpArr[i]==0) {
				bw.write("INF"+"\n");
			}else {
			bw.write(dpArr[i]+"\n");
			
			}
		}

		bw.flush();
		bw.close();
	}

}


