package Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2667 {

	static int[][] arr;
	static int[][] dirs = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } }; // 동 남 서 북

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];

		for (int i = 0; i < N; i++) {

			String[] strArr = br.readLine().split("");

			for (int j = 0; j < N; j++) {

				arr[i][j] = Integer.parseInt(strArr[j]);

			}

		}

		ArrayList<Integer> counts = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (arr[i][j] == 1) {

					int count = bfs(j, i);
					counts.add(count);
				}

			}
		}

		Collections.sort(counts);
		
		System.out.println(counts.size());

		for (int count : counts) {
			System.out.println(count);
		}

	}

	static int bfs(int x, int y) {

		int count = 1;

		Queue<int[]> queue = new LinkedList<>();
		arr[y][x]=0;
		queue.offer(new int[] { y, x });
		
		while (!queue.isEmpty()) {

			int[] cur = queue.poll();
			int curX = cur[1];
			int curY = cur[0];


			for (int[] dir : dirs) {

				int newX = curX + dir[1];
				int newY = curY + dir[0];

				if (newX >= 0 && newX < arr[0].length && newY >= 0 && newY < arr.length && arr[newY][newX] == 1) {
					queue.offer(new int[] { newY, newX });
					arr[newY][newX] = 0;
					count++;
				}

			}

		}

		return count;
	}

}
