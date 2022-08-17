package ClassQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon1260 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[] check;

	public static void bfs(ArrayList<Integer>[] list, int V) throws IOException {

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(V);
		if (check[V] == false) {
			bw.write(V + " "); // 들어오는 수 출력.
			check[V] = true; // 방문 .

		}
		while (!queue.isEmpty()) {
			
			for (int a : list[queue.poll()]) {

				if (check[a] == false) {

					queue.offer(a);
					bw.write(a + " ");
					check[a] = true;

				}
			
			}
	
		}

	}

	public static void dfs(ArrayList<Integer>[] list, int V) throws IOException {

		bw.write(V + " "); // 들어오는 수 출력.
		check[V] = true; // 방문 .
		for (int a : list[V]) {
			if (check[a] == false) {
				dfs(list, a);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		int N = Integer.parseInt(strArr[0]); // 정점의 개수
		int M = Integer.parseInt(strArr[1]); // 간선의 개수
		int V = Integer.parseInt(strArr[2]); // 탐색 시작 번호
		check = new boolean[1001];
		ArrayList<Integer>[] list = new ArrayList[N + 1];

		for (int i = 1; i < N + 1; i++) {
			list[i] = new ArrayList<>(); // ArrayList 안엔 ArrayList만 정의 가능.
		}

		for (int i = 1; i < M + 1; i++) {
			String[] strArr2 = br.readLine().split(" ");

			int a = Integer.parseInt(strArr2[0]);
			int b = Integer.parseInt(strArr2[1]);

			list[a].add(b); // 해당 인덱스 list에 값 저장 .
			list[b].add(a);

		}

		for (int i = 1; i < N + 1; i++) {
			Collections.sort(list[i]); // list 들을 미리 정렬.
		}

		dfs(list, V);
		check = new boolean[1001];
		bw.write("\n");
		bfs(list, V);

		bw.flush();
		bw.close();

	}

}
