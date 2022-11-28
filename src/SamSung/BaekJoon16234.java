package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon16234 {

	static int[][] arr;
	static int N, L, R;
	static int uniteCount;
	static int uniteSum;
	static int dayCount = 0;
	static int[][] dirs = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
	static LinkedList<int[]> uniteList;

	public static int dfs(int y, int x, int count) {

		return 0;

	}

	public static void unite(int y, int x, boolean[][] check) {

		for (int i = 0; i < 4; i++) {

			int y1 = y + dirs[i][0];
			int x1 = x + dirs[i][1];

			if (y1 >= 1 && x1 >= 1 && y1 < N + 1 && x1 < N + 1 && check[y1][x1] == false
					&& Math.abs(arr[y1][x1] - arr[y][x]) >= L && Math.abs(arr[y1][x1] - arr[y][x]) <= R) { //차이가 L, R사이 .

				uniteCount++;
				uniteSum += arr[y1][x1];
				check[y1][x1] = true;
				uniteList.add(new int[] { y1, x1 });

				unite(y1, x1, check);

			}

		}

	}

	public static void map() {

		boolean[][] check = new boolean[N + 1][N + 1];
		boolean checkDay = false;

		for (int i = 1; i < N + 1; i++) {

			for (int j = 1; j < N + 1; j++) {

				uniteCount = 1;
				uniteSum = arr[i][j];
				uniteList = new LinkedList<int[]>();
				uniteList.add(new int[] { i, j });

				if (!check[i][j]) {
					check[i][j] = true;
					unite(i, j, check);

					if (uniteCount > 1) {
					
						checkDay = true;

						for (int[] city : uniteList) {

							arr[city[0]][city[1]] = uniteSum / uniteCount;
							
//							System.out.println(uniteSum/uniteCount);

						}
//						System.out.println("uniteCount:"+uniteCount);
					}

				}

			}

		}
		if (checkDay) {
			dayCount++;
			map();
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		L = Integer.parseInt(strArr[1]);
		R = Integer.parseInt(strArr[2]);

		arr = new int[N + 1][N + 1];

		for (int i = 1; i < N + 1; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 1; j < N + 1; j++) {

				arr[i][j] = Integer.parseInt(strArr2[j - 1]);

			}

		}

		map();

		System.out.println(dayCount);

	}

}
