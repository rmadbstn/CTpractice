package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon15683 {

	static int N, M;
	static int[][] arr;

	static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } }; // 북 , 동 , 남 ,서

	static LinkedList<int[]> cctvList;

	static int Max = 0;

	public static void bfs(LinkedList<int[]> list) {

//		System.out.println("listSize:"+list.size());

		boolean[][] check = new boolean[N][M];
		Queue queue = new LinkedList<int[]>();

		int count = 0;

		for (int[] a : list) {
			queue.offer(a);
		}

//		System.out.println(queue.size());

		while (!queue.isEmpty()) {

			int[] cur = (int[]) queue.poll();

			int y1 = cur[0] + dirs[cur[2]][0];
			int x1 = cur[1] + dirs[cur[2]][1];

			if (y1 >= 0 && x1 >= 0 && y1 < N && x1 < M && arr[y1][x1] != 6) {

//				System.out.println("y1:"+y1+" x1:"+x1);

				queue.offer(new int[] { y1, x1, cur[2] });

				if (arr[y1][x1] == 0 && check[y1][x1] != true) {
					count++;
					check[y1][x1] = true;
				}

			}

		}
		if (count > Max) {
			Max = count;
		}

	}

	public static void dfs(LinkedList<int[]> list, int index) {
//		System.out.println("index:"+index);
//		System.out.println("size:" + cctvList.size());
		if (index == cctvList.size()) {
//			System.out.println("index:"+index);
			bfs(list);
			return;
		}

		int[] cur = cctvList.get(index);

//		System.out.println(Arrays.toString(cur));

		if (cur[2] == 1) {
			for (int i = 0; i < 4; i++) {

				list.add(new int[] { cur[0], cur[1], i });
				dfs(list, index + 1);
				list.removeLast();

			}

		} else if (cur[2] == 2) {

			for (int i = 0; i < 2; i++) {

				list.add(new int[] { cur[0], cur[1], i });
				list.add(new int[] { cur[0], cur[1], i + 2 });
				dfs(list, index + 1);
				list.removeLast();
				list.removeLast();

			}

		} else if (cur[2] == 3) {

			for (int i = 0; i < 4; i++) {

				list.add(new int[] { cur[0], cur[1], i });

				if (i == 3) {
					list.add(new int[] { cur[0], cur[1], 0 });
				} else {
					list.add(new int[] { cur[0], cur[1], i + 1 });
				}
				dfs(list, index + 1);

				list.removeLast();
				list.removeLast();

			}

		} else if (cur[2] == 4) {

			for (int i = 0; i < 4; i++) {

				if (i < 2) {
					list.add(new int[] { cur[0], cur[1], i });
					list.add(new int[] { cur[0], cur[1], i + 1 });
					list.add(new int[] { cur[0], cur[1], i + 2 });
				} else {
					list.add(new int[] { cur[0], cur[1], i });

					if (i == 2) {
						list.add(new int[] { cur[0], cur[1], i + 1 });
						list.add(new int[] { cur[0], cur[1], 0 });

					} else {
						list.add(new int[] { cur[0], cur[1], 0 });
						list.add(new int[] { cur[0], cur[1], 1 });

					}
				}

				dfs(list, index + 1);

				list.removeLast();
				list.removeLast();
				list.removeLast();

			}

		} else { // CCTV 5번일때.

			for (int i = 0; i < 4; i++) {
				list.add(new int[] { cur[0], cur[1], i });
			}

			dfs(list, index + 1);
			list.removeLast();
			list.removeLast();
			list.removeLast();
			list.removeLast();
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		cctvList = new LinkedList<int[]>();

		String[] strArr2 = br.readLine().split(" ");
		N = Integer.parseInt(strArr2[0]);
		M = Integer.parseInt(strArr2[1]);

		int blindPlace = N * M;

		arr = new int[N][M];

		for (int i = 0; i < N; i++) {

			String[] strArr = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				arr[i][j] = Integer.parseInt(strArr[j]);

				if (arr[i][j] != 0 && arr[i][j] != 6) {

					cctvList.add(new int[] { i, j, arr[i][j] });
					blindPlace--;
				}

				if (arr[i][j] == 6) {
					blindPlace--;
				}

			}

		}

//		System.out.println(cctvList.size());

		dfs(new LinkedList<int[]>(), 0);

//		System.out.println(Max);

		System.out.println(blindPlace - Max);
	}

}
