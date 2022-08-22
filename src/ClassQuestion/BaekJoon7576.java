package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon7576 {

	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	static int N, M;
	static int Max = 1000000;

	public static void bfs(int[][] arr) {

		Queue<int[]> queue = new LinkedList<>();

		// bfs 진입.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				if (arr[i][j] == 1) {
					int[] now = { j, i };  //1인 곳의 x좌표, y좌표를 미리 큐에넣어 동시에 돌아가게 함. 
					queue.offer(now);
				}

			}
		}

		
		int bfsMax = 0;

		while (!queue.isEmpty()) {

			int[] temp = queue.poll();

			for (int[] dir : dirs) {

				int x1 = temp[0] + dir[0];
				int y1 = temp[1] + dir[1];

				if (x1 >= 0 && y1 >= 0 && x1 < M && y1 < N && arr[y1][x1] != -1) {

					if (arr[y1][x1] > arr[temp[1]][temp[0]] + 1 || arr[y1][x1] == 0) { // 이웃 토마토가 안익었거나 현재 진행중인 확산에서 더
																						// 적은 일수가 걸리면 토마투 일수를 갱신.
//						System.out.println("x;"+x1+" y:"+y1);
						
						arr[y1][x1] = arr[temp[1]][temp[0]] + 1; // 기존 토마토 다음날 익는 토마토. , 1이 초기값이라 나중에 1을 최종적으로 익는데 걸리는
																	// 일수에서 빼주면 된다.
																	// 방문처리.
						int[] temp2 = { x1, y1 };
						queue.offer(temp2);
						if (arr[y1][x1] - 1 > bfsMax) {
							bfsMax = arr[y1][x1] - 1;
						}
					}

				}

			}

		}
		Max = Math.min(bfsMax, Max);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//		String[] strArr = br.readLine().split(" ");

		M = Integer.parseInt(st.nextToken()); // 가로길이.
		N = Integer.parseInt(st.nextToken()); // 세로길이.

		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < M; j++) {

				arr[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		// bfs 진입.

		bfs(arr);

		int result = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				if (arr[i][j] == 0) {

					Max = -1;
					i = N; // 종료 시키기.
					j = M;
					break;
				}

			}
		}

		System.out.println(Max);

	}

}
