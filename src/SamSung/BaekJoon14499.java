package SamSung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon14499 {

	static int N, M, K, X, Y;
	static int[][] map;
	static int[] moveArr;
	static int[] dice; // 0번 : Bottom, 1번 : Back , 2번:Top
						// 3번 : Front, 4번 : Left , 5번:Right

	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } }; // 동, 서, 북, 남.

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void move(int index, int y, int x) throws IOException {

		if (index == K) {
//			bw.write(" Left:"+dice[4]+" Right:"+dice[5]+" Bottom:"+dice[0]+" Top:"+dice[2]+" Front:"+dice[3]+" Back:"+dice[1]+"\n");
			return;
		}
		
		
		
		
		
		int dir = moveArr[index] - 1;
//		bw.write(dir + "\n");

		int y1 = y + dirs[dir][0];
		int x1 = x + dirs[dir][1];

		if (y1 < 0 || x1 < 0 || y1 >= N || x1 >= M) {
			move(index + 1, y, x);
			return;
		}
		
		
//		bw.write(" Left:"+dice[4]+" Right:"+dice[5]+" Bottom:"+dice[0]+" Top:"+dice[2]+" Front:"+dice[3]+" Back:"+dice[1]+" 방향:"+moveArr[index]+"\n");
		
		
//		bw.write(x1+" "+y1+"\n");
		int temp = dice[0];

		dice[0] = map[y1][x1];

		switch (dir+1) {

		case 1:

			dice[0] = dice[5];
			dice[5] = dice[2];
			dice[2] = dice[4];
			dice[4] = temp;
			if (map[y1][x1] == 0) {

				map[y1][x1] = dice[0];

			} else {
				dice[0] = map[y1][x1];
				map[y1][x1] = 0;
			}

			break;
		case 2:

			dice[0] = dice[4];
			dice[4] = dice[2];
			dice[2] = dice[5];
			dice[5] = temp;
			if (map[y1][x1] == 0) {

				map[y1][x1] = dice[0];

			} else {
				dice[0] = map[y1][x1];
				map[y1][x1] = 0;
			}
			break;
		case 3:
			dice[0] = dice[1];
			dice[1] = dice[2];
			dice[2] = dice[3];
			dice[3] = temp;
			if (map[y1][x1] == 0) {

				map[y1][x1] = dice[0];

			} else {
				dice[0] = map[y1][x1];
				map[y1][x1] = 0;
			}
			break;	
			
		case 4:
			dice[0] = dice[3];
			dice[3] = dice[2];
			dice[2] = dice[1];
			dice[1] = temp;
			if (map[y1][x1] == 0) {

				map[y1][x1] = dice[0];

			} else {
				dice[0] = map[y1][x1];
				map[y1][x1] = 0;
			}
			break;

	
		default:
			break;

		}
//		bw.write("방향:"+(dir+1) + "\n");
		bw.write(dice[2] + "\n");

		move(index + 1, y1, x1);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		X = Integer.parseInt(strArr[2]);
		Y = Integer.parseInt(strArr[3]);
		K = Integer.parseInt(strArr[4]);

		map = new int[N][M];
		dice = new int[6];

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				map[i][j] = Integer.parseInt(strArr2[j]);

			}

		}

		String[] strArr3 = br.readLine().split(" ");

		moveArr = new int[strArr3.length];

		for (int i = 0; i < strArr3.length; i++) {

			moveArr[i] = Integer.parseInt(strArr3[i]);

		}

		move(0, X, Y);

		bw.flush();
		bw.close();

	}

}
