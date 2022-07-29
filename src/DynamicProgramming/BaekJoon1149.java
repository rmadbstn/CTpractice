package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1149 {

	static int N;
	static int[][] arr;
	static int[][] dpArr;

	public static int dp(int colorNum,int N) {
		
		if(dpArr[N][colorNum]==0) {
			
		
		if(colorNum==0) {									//도착지의 색깔별로 앞의 나머지 두 색까지의 최소값을 비교 후 선택.
		
				dpArr[N][0]=Math.min(dp(1,N-1),dp(2,N-1))+arr[N][0];
		}
		
		if(colorNum==1) {
			
			dpArr[N][1]=Math.min(dp(0,N-1),dp(2,N-1))+arr[N][1];
	}
		if(colorNum==2) {
			
			dpArr[N][2]=Math.min(dp(0,N-1),dp(1,N-1))+arr[N][2];
	}
		}
		return dpArr[N][colorNum];
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N][3];    // 집별 색의 가중치.
		dpArr = new int[N][3];  //그 집까지 색을 칠하는데 드는 최소비용을 저장하는 배열.

		for (int i = 0; i < N; i++) {

			String[] strArr = br.readLine().split(" ");

			arr[i][0] = Integer.parseInt(strArr[0]);
			arr[i][1] = Integer.parseInt(strArr[1]);
			arr[i][2] = Integer.parseInt(strArr[2]);

		}

		dpArr[0][0] = arr[0][0];
		dpArr[0][1] = arr[0][1];
		dpArr[0][2] = arr[0][2];
		
		int min = Math.min(dp(0,N-1),Math.min(dp(1,N-1),dp(2,N-1)));
		System.out.println(min);
	}
	
	

}
