package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon1463 {

	static int N;
	static int[] dpArr;

	public static int dp(int N) {

		
		if (N == 1) {
			return 0;
		}

		if (N == 2 || N == 3) {
			
			return 1;
		}

		
		
		
		if (dpArr[N] != 0) { // null값이 아닐경우 리턴.

			return dpArr[N];

		}

		
//		 4가지경우. 나눌때 나머지가 있으면 나머지만큼 횟수를 더해주면 될듯.
//		
//		 dp(N/3)+N%3+1;
//		 dp(N/2)+N%2+1;
//		 dp(N-1)+1;
		
		dpArr[N] = Math.min( Math.min(dp(N/3)+N%3+1,dp(N/2)+N%2+1),dp(N-1)+1 );


		return dpArr[N];

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		dpArr = new int[1000001];

		if(N>3) {
			
			dpArr[1]=0;
			dpArr[2]=1;
			dpArr[3]=1;
			
		}
		System.out.println(dp(N));
	}

}
