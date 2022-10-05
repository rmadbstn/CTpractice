package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon14891 {

	static int[][] arr;
	static int[] cursors;

	public static int[] spinWheel(int[] wheelArr, int dir) {

		if (dir == 1) {

			wheelArr[0] = wheelArr[8];

			for (int i = 8; i >= 2; i--) {
				wheelArr[i] = wheelArr[i - 1];
			}

			wheelArr[1] = wheelArr[0];

		} else {

			wheelArr[0] = wheelArr[1];

			for (int i = 1; i <= 7; i++) {
				wheelArr[i] = wheelArr[i + 1];
			}

			wheelArr[8] = wheelArr[0];

		}

		return wheelArr;

	}

	public static void wheel(int wheelIndex, int prevIndex, int dir) {

		if (wheelIndex > prevIndex) {
			

			if (arr[prevIndex][3] != arr[wheelIndex][7]) {

				if (wheelIndex + 1 <= 3) {

					wheel(wheelIndex + 1, wheelIndex, dir*(-1));
				}

				arr[wheelIndex] = spinWheel(arr[wheelIndex], dir*(-1));

			}
			
			

		}else {
			
			if (arr[prevIndex][7] != arr[wheelIndex][3]) {

				if (wheelIndex - 1 >= 1) {

					wheel(wheelIndex - 1, wheelIndex, dir*(-1));
				}

				arr[wheelIndex] = spinWheel(arr[wheelIndex], dir*(-1));

			}
			
			
			
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[5][9];

		cursors = new int[9];

		for (int i = 1; i <= 4; i++) {

			String str = br.readLine();

			for (int j = 1; j <= 8; j++) {

				arr[i][j] = str.charAt(i - 1) - '0';

			}

		}

		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {

			String[] strArr = br.readLine().split(" ");

			int wheelIndex = Integer.parseInt(strArr[0]);
			int dir = Integer.parseInt(strArr[1]); // 1:시계방향, -1:반시계방향.

			if (wheelIndex == 2 || wheelIndex == 3) {

				wheel(wheelIndex - 1, wheelIndex, dir);
				wheel(wheelIndex + 1, wheelIndex, dir);

			} else if (wheelIndex == 1) {
				wheel(wheelIndex + 1, wheelIndex, dir);
			} else {
				wheel(wheelIndex - 1, wheelIndex, dir);
			}

			arr[wheelIndex] = spinWheel(arr[wheelIndex], dir);

		}
		
		
		int result = 0;
		
		
		for(int i=1;i<=4;i++) {
			
			if(arr[i][1]==1) {
				result+= 2*(i-1);
			}
			
		}
		
		System.out.println(result);

	}

}
