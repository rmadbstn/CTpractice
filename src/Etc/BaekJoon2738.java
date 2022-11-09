package Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2738 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);

		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {

			String[] strArr2 = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				arr[i][j] = Integer.parseInt(strArr2[j]);

			}

		}

		for (int i = 0; i < N; i++) {

			String[] strArr3 = br.readLine().split(" ");

			for (int j = 0; j < M; j++) {

				arr[i][j] += Integer.parseInt(strArr3[j]);

			}

		}
		
		for (int i = 0; i < N; i++) {

	
			for (int j = 0; j < M; j++) {

				System.out.print(arr[i][j]+" "); 

			}
			System.out.println();

		}
		
		
		
		
		

	}

}
