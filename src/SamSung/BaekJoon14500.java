package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon14500 {

	static int N, M;

	static int[][] arr;
	static boolean[][] check;

	static int[][] dirs = { { 1, 0 }, { 0, -1 }, { -1, 0 }, { 0, 1 } };
	static int Max = 0;

	public static void tetro(int[] start) {


		
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(start);

		while (!queue.isEmpty()) {

			int[] cur = queue.poll();

			
			
			
			
			int curX = cur[1];
			int curY = cur[0];

			int prevX = cur[5];
			int prevY = cur[4];

			if (cur[2] == 1) {
				int fxxxyou[] = new int[4];

				for (int i= 0;i<4;i++) {

					
					int[] dir = dirs[i];
					
					int fxxxX = curX + dir[1];

					int fxxxY = curY + dir[0];

					if (fxxxY < 0 || fxxxX < 0 || fxxxY >= N || fxxxX >= M) {
						continue;
					}
					
					fxxxyou[i] = arr[fxxxY][fxxxX];
					
				}
				
				Arrays.sort(fxxxyou);
				
				int sum = cur[3]+fxxxyou[3]+fxxxyou[2]+fxxxyou[1];
				
				
				
				Max = Math.max(Max,sum);
				

			}

			for (int[] dir : dirs) {

				int x1 = curX + dir[1];

				int y1 = curY + dir[0];

				if (y1 < 0 || x1 < 0 || y1 >= N || x1 >= M) {
					continue;
				}

				if (y1 == prevY && x1 == prevX) {
					continue;
				}

				int level = cur[2] + 1;

				int value = cur[3] + arr[y1][x1];

//				System.out.println(y1+" "+x1);
				
				if (level == 4) {
					Max = Math.max(Max, value);
				}

				else {

					queue.offer(new int[] { y1, x1, level, value, curY, curX });
					
				}

			}

		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		arr = new int[N][M];


		check = new boolean[N][M];

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				arr[i][j] = Integer.parseInt(strArr2[j]);

			}

		}

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < M; j++) {

				tetro(new int[] { i, j, 1, arr[i][j], -1, -1 });


				check[i][j] = true;

			}

		}

		System.out.println(Max);
	}

}
