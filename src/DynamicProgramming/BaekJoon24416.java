package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon24416 {
	static int fibCount = 0;
	static int dpCount=0;
	static int[] dpArr;
	public static int dp(int N) {
		
		if(dpArr[N]!=0) {
			return dpArr[N];
		}
		
		
			dpCount++;
			dpArr[N] = dp(N-1)+dp(N-2);
			
			
	
		
		return dpArr[N];
		
	}

	public static int fib(int N) {

		if (N == 1 || N == 2) {
			fibCount++;	return 1;	 
		}

		
		
		
		
		return fib(N - 1) + fib(N - 2);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		dpArr = new int[N+1];
		dpArr[1] = 1;
		dpArr[2] = 1;
		
		fib(N);
		dp(N);
		

		System.out.println(fibCount);
		System.out.println(dpCount);
	}

}
