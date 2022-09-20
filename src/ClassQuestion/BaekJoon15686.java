package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BaekJoon15686 {

	static int N, M;
	static List<int[]> chickens;
	static int[] indexGroup;
	static int[][] arr;
	static int house = 0;
	static int Min = 2000;

	static int dirs[][] = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

	public static void bfs() {

		boolean[][] check = new boolean[N][N];

		int distance = 0;
		int houseCount = 0;

		Queue<int[]> queue = new LinkedList<>();

		for (int index : indexGroup) {

			int[] xy = chickens.get(index);
			
//			System.out.println("chicken: "+xy[1] +" " + xy[0]);

			check[xy[0]][xy[1]] = true;

			queue.offer(new int[] { xy[0], xy[1], 0 });

		}

		while (!queue.isEmpty()) {

			int[] cur = queue.poll();

			for (int[] dir : dirs) {

				int y1 = cur[0] + dir[0];

				int x1 = cur[1] + dir[1];

				
				
				int curLevel = cur[2];
				
				

				if (y1 < 0 || x1 < 0 || x1 >= N || y1 >= N || check[y1][x1] == true ) {
					continue;
				}
				
//				System.out.println("x1:"+x1+" y1:"+y1);
//				System.out.println("+"+(curLevel+1));

				if (arr[y1][x1] == 1) {

//					System.out.println("x1:"+x1+" y1:"+y1);
//					System.out.println("+"+(curLevel+1));
					distance += curLevel + 1;
					houseCount++;

					if (houseCount == house) {

						break;
					}

				}

				queue.offer(new int[] { y1, x1, curLevel + 1 });
				check[y1][x1] = true;

			}

			if (houseCount == house) {

				if (distance < Min) {
					Min = distance;
				}

				break;
			}

		}

	}

	public static void yunsu(int index, int count) {

		if (count == M) {

			bfs();

			return;
		}

		for (int i = index; i < chickens.size(); i++) {

			indexGroup[count] = i;
			yunsu(i + 1, count + 1);
			

		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		arr = new int[N][N];
		indexGroup = new int[M];

		chickens = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 0; j < N; j++) {

				arr[i][j] = Integer.parseInt(strArr2[j]);

				if (arr[i][j] == 2) {

					chickens.add(new int[] { i, j });

				}

				if (arr[i][j] == 1) {

					house++;

				}

			}
			

		}
		
//		System.out.println("chickenSize:"+chickens.size());
		yunsu(0, 0);
		System.out.println(Min);
	}

}
