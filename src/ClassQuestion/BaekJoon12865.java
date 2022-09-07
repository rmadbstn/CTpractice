package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon12865 {

	static int[][] arr;
	static int[][] dpArr; // 가치별 최대.
	static int K; // 버틸 수 있는 무게.
	static int N; // 물건의 개수.

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);// 물건의 개수.
		K = Integer.parseInt(strArr[1]);// 버틸 수 있는 무게.

		arr = new int[N+1][2]; // 물건 담는 배열.
		dpArr = new int[N+1][K+1];
		for (int i = 1; i < N+1; i++) {
			String[] strArr2 = br.readLine().split(" ");

			arr[i][0] = Integer.parseInt(strArr2[0]); // i번째 물건의 무게
			arr[i][1] = Integer.parseInt(strArr2[1]); // i번째 물건의 가치

		}

		for (int i = 1; i < N+1; i++) {

			for(int j=1;j<=K;j++) {
				
				if(arr[i][0]<=j) {
					
					dpArr[i][j] =Math.max(arr[i][1]+dpArr[i-1][j-arr[i][0]],dpArr[i-1][j]);
					
				    
					
				}else {
					dpArr[i][j] = Math.max(dpArr[i-1][j],dpArr[i][j-1]);
				}
				
				
				
				
			}
			
			
		}

		
		System.out.println(dpArr[N][K]);
	}

}
