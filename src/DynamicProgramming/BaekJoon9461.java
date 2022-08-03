package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon9461 {

	static int N;
	static long[] dpArr;

	public static long dp(int N) {

		if (dpArr[N] != 0) {
			return dpArr[N];
		}

		dpArr[N] = dp(N - 2) + dp(N - 3);

		return dpArr[N];

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();   


		dpArr = new long[101];   //수가 커지면 int형으로 불가능. long형으로 해주어야함.

		dpArr[1] = 1;
		dpArr[2] = 1;
		dpArr[3] = 1;
	
		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();
			System.out.println(dp(a));
			
		}

		
	}

}
