package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14502 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		
		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);
		
		int[][] arr = new int[N][M];
		
		for(int i=0;i<N;i++) {
			
			String[] strArr2 = br.readLine().split(" ");
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(strArr2[j]);
			}
			
		}
		
		int[][] abc = new int[3][2];  // 벽 3개의 xy좌표. 	
		
		
		
	}

}
