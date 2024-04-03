package Programmerslv2;

public class FibonacciNumber {

	static long[] dpArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 3;
		dpArr = new long[N + 1];

		dpArr[0] = 0;
		dpArr[1] = 1;

//		dpArr[N] = dp(N);/
		dp(N);

		System.out.println(dpArr[N]);

	}

	public static long dp(int n) {

		if (dpArr[n] != 0 || n == 0 || n == 1) {
			return dpArr[n];
		}

		dpArr[n] = dp(n - 1) + dp(n - 2);

		return dpArr[n]%1234567;

	}

}
