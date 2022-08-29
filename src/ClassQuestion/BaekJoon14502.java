package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon14502 {
	static int N, M;
	static int arr[][];
	static int copyArr[][];
	static int dirs[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	static int Max = 0;

	public static void bfs() {

		int count = 0;

		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copyArr[i][j] == 2) {
					queue.offer(new int[] { i, j }); // i:y j:x
				}
			}
		}

		while (!queue.isEmpty()) {

			int[] temp = queue.poll();

			int x = temp[1];
			int y = temp[0];

			for (int[] dir : dirs) {

				int x1 = x + dir[1];
				int y1 = y + dir[0];

				if (x1 < M && y1 < N && y1 >= 0 && x1 >= 0 && copyArr[y1][x1] == 0) {

					copyArr[y1][x1] = 2;
					queue.offer(new int[] { y1, x1 });

				}

			}

		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copyArr[i][j] == 0) {
					count++; // i:y j:

				}
			}
		}

		if (count > Max) {
			Max = count;
		}

	}

	public static void walls(int wallCount) {

		if (wallCount == 3) {
			
			for (int i = 0; i < N; i++) {

				for (int j = 0; j < M; j++) {

					copyArr[i][j] = arr[i][j];

				}

			}
			bfs();

			return;
		}

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < M; j++) {

				if (arr[i][j] == 0) {
					arr[i][j] = 1;
					walls(wallCount + 1);
					arr[i][j] = 0;

				}

			}

		}
		return;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		arr = new int[N][M];
		copyArr = new int[N][M];

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(strArr2[j]);
			}

		}

		walls(0);

		System.out.println(Max);

	}

}
