package ClassQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1003 {

	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static int[][] dpArr = new int[41][2];

	static int oneCount = 0;
	static int zeroCount = 0;

	public static int fibonacci(int n) {

		if (n == 0) {

			zeroCount++;
//			if (dpArr[n][0] == 0 && dpArr[n][1] == 0) {
//				dpArr[n][0] = zeroCount;
//				dpArr[n][1] = oneCount;
//			}
//			System.out.println("0");
			return 0;
		}

		if (n == 1) {
			oneCount++;
//			if (dpArr[n][0] == 0 && dpArr[n][1] == 0) {
//				dpArr[n][0] = zeroCount;
//				dpArr[n][1] = oneCount;
//			}
			return 1;
		}
		
		if (dpArr[n][0] == 0 && dpArr[n][1] == 0) {
			dpArr[n][0] = zeroCount;
			dpArr[n][1] = oneCount;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		arr = new int[testCase];

		int max = 0;

		for (int i = 0; i < testCase; i++) {

			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		fibonacci(max);

		for (int i = 0; i < testCase; i++) {

			sb.append(dpArr[arr[i]][0] + " " + dpArr[arr[i]][1] + "\n");

		}
		
		System.out.println(sb);
	}

}
