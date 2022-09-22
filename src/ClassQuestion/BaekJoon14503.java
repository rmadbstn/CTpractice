package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14503 {

	static int N, M;
	static int[][] arr;

	static int[][] leftDirs = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } }; // 북쪽 방향을 볼때(index 가 0일 때)왼쪽인 -1,0을 체크, 나머지도
																			// 같은
	static int[][] backDirs = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } }; // 보는 방향에 따라 후진.
	static boolean[][] cleanCheck;
	static int finalCount = 0;

	public static void cleaner(int[] position, int vector) {

//		System.out.println("x:"+position[1]+" y:"+position[0]+" vector:"+vector);
		
		
		if(cleanCheck[position[0]][position[1]] == false) {
			
			cleanCheck[position[0]][position[1]] = true;
			finalCount++;
			
		}

		int[] leftDir;
		int[] backDir;

		

		int count = 0;

		while (count < 4) {

			int leftX = position[1] + leftDirs[vector][0];
			int leftY = position[0] + leftDirs[vector][1];
			
//			System.out.println("leftX:"+leftX+" leftY:"+leftY);

			if (cleanCheck[leftY][leftX] == false && arr[leftY][leftX] == 0) {

				if(vector==0) {
					vector = 3;
				}else {
					vector--;
				}
				
				cleaner(new int[] {leftY,leftX},vector);
				
				break;
				
			}
			
			
			if(vector==0) {
				vector = 3;
			}else {
				vector--;
			}
			
			
			count++;
			
			
			if(count==4) {
				
				int backX = position[1] + backDirs[vector][0];
				int backY = position[0] + backDirs[vector][1];
				if(arr[backY][backX]==0) {
				cleaner(new int[] {backY,backX},vector);
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
		cleanCheck = new boolean[N][M];
		String[] strArr2 = br.readLine().split(" ");

		int y = Integer.parseInt(strArr2[0]); // 청소기의 y좌표
		int x = Integer.parseInt(strArr2[1]); // 청소기의 x좌표
		int d = Integer.parseInt(strArr2[2]); // 청소기가 보고있는 방향. 0:북, 1:동, 2:남 , 3:서

		for (int i = 0; i < N; i++) {

			String[] strArr3 = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				arr[i][j] = Integer.parseInt(strArr3[j]);

			}

		}

		cleaner(new int[] {y,x},d);
		
		System.out.println(finalCount);
	}

}
