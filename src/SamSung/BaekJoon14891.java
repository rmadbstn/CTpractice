package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon14891 {

	static int[][] arr;
	static int[] cursors;
	static boolean[] check;

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

	public static void wheel(int wheelIndex,  int dir) {

		check[wheelIndex]=true;
		
		
		if(wheelIndex-1>=1&&check[wheelIndex-1]==false) {
			
			if(arr[wheelIndex][7]!=arr[wheelIndex-1][3]) {
				wheel(wheelIndex-1,dir*(-1));
			}
			
		}
		
		
		if(wheelIndex+1<=4&&check[wheelIndex+1]==false) {
			
			if(arr[wheelIndex][3]!=arr[wheelIndex+1][7]) {
				wheel(wheelIndex+1,dir*(-1));
			}
		}
		
		
		
//		System.out.print(wheelIndex+"번째:"+Arrays.toString(arr[wheelIndex])+"->");
		arr[wheelIndex]= spinWheel(arr[wheelIndex],dir);
		
//		System.out.print(Arrays.toString(arr[wheelIndex]));

//		System.out.println();
		

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		arr = new int[5][9];

		cursors = new int[9];

		for (int i = 1; i <= 4; i++) {

			String str = br.readLine();

			for (int j = 1; j <= 8; j++) {

				arr[i][j] = str.charAt(j - 1) - '0';

			}

		}

		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {

			String[] strArr = br.readLine().split(" ");

			int wheelIndex = Integer.parseInt(strArr[0]);
			int dir = Integer.parseInt(strArr[1]); // 1:시계방향, -1:반시계방향.

			check = new boolean[5];
			
			wheel(wheelIndex,dir);

		}
		
		
		int result = 0;		
		
		
		for(int i=1;i<=4;i++) {
			
//			System.out.println(Arrays.toString(arr[i]));
//			System.out.println("arr[i][1]:"+arr[i][1]);
			
			if(arr[i][1] == 1) {
				
			
				
				result+=Math.pow(2,i-1);
				
//				System.out.println(result);
			}
			
			
		}
		

		System.out.println(result);
		
	}

}
