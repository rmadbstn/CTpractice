package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon3190 {

	static int[][] board;

	static int N;

	static int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 동남서북. 시계방향.

	static int tailX = 1, tailY = 1; // 꼬리좌표.

	static int[] rludArray;

	public static void snake(int dir, int second, int y, int x) {

//		System.out.println(x+" "+y);
		
		if (x < 1 || y < 1 || x > N || y > N || board[y][x] > 0) {
			
			System.out.println(second);
			
			return;
		}

		if (second != 0 && board[y][x] != -1) { // 사과가 없을 때.

			int tailDir = board[tailY][tailX]; // 꼬리가 있는 좌표의 방향.

			board[tailY][tailX] = 0; // 꼬리가 있던곳 꼬리 자르기.

			tailX += dirs[tailDir - 1][1];
			tailY += dirs[tailDir - 1][0]; // 꼬리의 좌표를 변경.

//			System.out.println("꼬리:"+tailY+" "+tailX);
		}

		
		
		if (rludArray[second] == 2) {

			if (dir == 4) {
				dir = 1;
			} else {
				dir++;
			}
		} else if (rludArray[second] == 1) {

			if (dir == 1) {
				dir = 4;
			} else {
				dir--;
			}

		}

		board[y][x] = dir; // 지금 위치의 뱀의 진행방향(몸뚱아리) 저장.
	
//		System.out.println("몸뚱아리:"+y+" "+x);
	

		int y1 = y + dirs[dir - 1][0];
		int x1 = x + dirs[dir - 1][1];

		snake(dir, second + 1, y1, x1);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		board = new int[N + 1][N + 1];

		for (int i = 0; i < K; i++) {

			String[] strArr = br.readLine().split(" ");

			int y = Integer.parseInt(strArr[0]);
			int x = Integer.parseInt(strArr[1]);

			board[y][x] = -1; // 사과가 있는 칸은 -1.

		}

		int L = Integer.parseInt(br.readLine()); // 뱀의 방향전환 횟수.

		rludArray = new int[10001];

		for (int i = 0; i < L; i++) {

			String[] strArr2 = br.readLine().split(" ");

			int second = Integer.parseInt(strArr2[0]);
			if (strArr2[1].charAt(0) == 'D') {

				rludArray[second] = 2; // 오른쪽.
			} else {
				rludArray[second] = 1; // 왼쪽.
			}

			// 시간별

		}

		snake(1,0,1,1);
		
	}

}
