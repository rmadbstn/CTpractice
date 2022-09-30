package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14890 {

	static int N, L;
	static int[][] arr;
	static int count = 0;
	static int line = 0;
	
	
	public static boolean checkL(int[] road, int index, int prev, int ramp) {

//		System.out.println("Check");
		

		if (road[index] < prev) {
			
			if (index > N - L) {

				return false;
			}
			

			for (int i = index; i < index + L; i++) {

				if (road[i] != prev - 1) {

					return false;

				}

			}

		} else {
			
			if(index-L<=ramp||index<L) {
				return false;
			}
			 	
			for (int i = index-1; i >= index - L; i--) {

				if (road[i] != road[index]-1 ) {

					return false;

				}

			}

		}

		
		
		return true;

	}

	public static void checkRoad(int[] road) {
		
		int ramp=-L;  //경사로의 끝 index.  

		for (int i = 0; i < N -1; i++) {

			if (road[i + 1] < road[i] || road[i + 1] > road[i]) {

				if (!checkL(road, i + 1, road[i],ramp)) {

					return;

				}
				if(road[i+1]<road[i]) {
				i+=L-1;
				
				ramp = i+1;
				}				
				
				
			}

		}
//		System.out.println("통과 ");
		count++;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		L = Integer.parseInt(strArr[1]); // 경사로 길이.

		arr = new int[N][N];

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 0; j < N; j++) {

				arr[i][j] = Integer.parseInt(strArr2[j]);

			}

		}

		for (int i = 0; i < N; i++) {

			int[] checkArr = new int[N];
			line++;
			
//			System.out.println("가로"+line+"번째:");
			for (int j = 0; j < N; j++) {
				checkArr[j] = arr[i][j];

			}

			
			checkRoad(checkArr);

//			System.out.println("세로"+line+"번째:");
			
			
			for (int j = 0; j < N; j++) {
				checkArr[j] = arr[j][i];
			}

			checkRoad(checkArr);

		}
		System.out.println(count);
	}

}
