package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon2579 {

	static int[] dpArr;
	static int[] arr;

	public static int dp(int N) {
		
		if(dpArr[N]!=0) {
			return dpArr[N];
		}

		if (N == 0) {
			dpArr[N] = arr[0];
			return dpArr[N];
		}
		if (N == 1) {
			dpArr[N] = arr[0] + arr[1];
			return dpArr[N];
		}
		if (N == 2) {
			dpArr[N] = Integer.max(arr[2] + arr[1], arr[2] + arr[0]);
			return dpArr[N];
		}

		dpArr[N] = Math.max(dp(N - 3) + arr[N - 1] + arr[N], dp(N - 2) + arr[N]);

		return dpArr[N];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		arr = new int[N];
		dpArr = new int[N];
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();

		}
//		dpArr[0] = arr[0];
//		dpArr[1] = arr[0] + arr[1];                                      --> N 이 1일경우 오류.
//		dpArr[2] = Integer.max(arr[2] + arr[1], arr[2] + arr[0]);
		System.out.println(dp(N - 1));
	}

}
