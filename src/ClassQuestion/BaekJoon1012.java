package ClassQuestion;

import java.util.Scanner;

public class BaekJoon1012 {

	static int count;
	static int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	static int N, M;

	public static void dfs(int[][] arr, int x, int y) {

		if (x < 0 || y < 0 || x >= N || y >= M || arr[x][y] == 0) {
			return;
		}

		arr[x][y] = 0; // 이미 확인한 땅.

		for (int[] dir : dirs) {

			int x1 = x + dir[0];
			int y1 = y + dir[1];

			dfs(arr, x1, y1);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트 케이스 .
		for (int s = 0; s < T; s++) {

			M = sc.nextInt(); // 배추밭 가로길이
			N = sc.nextInt(); // 배추밭 세로길이
			int K = sc.nextInt(); // 심은 배추의 개수.

			int[][] arr = new int[N][M];

			count = 0; // 배추 집합의 개수.

			for (int i = 0; i < K; i++) {

				int x = sc.nextInt();
				int y = sc.nextInt();
				
				arr[y][x]=1;

			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {

					if (arr[i][j] == 1) {
						count++;
						dfs(arr, i, j);
					}

				}
			}
			
			
			System.out.println(count);

		}

	}

}
