package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon15685 {

	static int[][] arr;
	static int count;

	public static void check(int i, int j) {

		if (arr[i + 1][j] == 0) {
			return;
		} else if (arr[i + 1][j + 1] == 0) {
			return;
		} else if (arr[i][j + 1] == 0) {
			return;
		} else {
			count++;
			return;
		}

	}

	public static Deque<Integer> dragon(Deque<Integer> deque, int g) {

		if (g == 0) {
			return deque;
		}

		Deque<Integer> newDeque = new ArrayDeque<>();

		while (!deque.isEmpty()) {

			int temp = deque.pollFirst();

			newDeque.addLast(temp);

			if (temp == 3) {
//				System.out.println("test");
				newDeque.addFirst(0);
			} else {
				newDeque.addFirst(temp + 1);
			}

		}

		return dragon(newDeque, g - 1);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 드래곤 커브의 개수.

		arr = new int[101][101];

		for (int i = 0; i < N; i++) {

			String[] strArr = br.readLine().split(" ");

			int x = Integer.parseInt(strArr[0]); // 시작점의 x좌표.
			int y = Integer.parseInt(strArr[1]); // 시작점의 y좌표.
			int d = Integer.parseInt(strArr[2]); // 시작 방향. 0: x좌표가 증가하는 방향. 1: y좌표가 감소하는 방향(위), 2: x좌표가 감소하는 방향 3: y좌표가
													// 증가하는 방향(아래).
			int g = Integer.parseInt(strArr[3]); // 세대

			Deque<Integer> deque = new ArrayDeque<>();
			deque.addFirst(d);

			Deque<Integer> finalDeque = dragon(deque, g);

			arr[y][x] = 1;

			while (!finalDeque.isEmpty()) {

				int dir = finalDeque.pollLast();

				if (dir == 0) {

					x += 1;

				} else if (dir == 1) {
					y -= 1;
				} else if (dir == 2) {

					x -= 1;
				} else {
					y += 1;
				}

				if (y >= 0 && x >= 0 && x <= 100 && y <= 100) {
					arr[y][x] = 1; // 드래곤 커브가 지나가는 꼭짓점 전부 체크.
				}
//				System.out.println(finalDeque.pollFirst());
			}

		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {

				if (arr[i][j] == 1) {
					check(i, j);
				}
			}
		}

		System.out.println(count);

	}

}
