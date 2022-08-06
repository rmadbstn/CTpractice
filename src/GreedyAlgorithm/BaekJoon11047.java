package GreedyAlgorithm;

import java.util.Scanner;

public class BaekJoon11047 {

	static int count = 0;
	static int sum;
	static int[] arr;

	public static void coinCheck(int i) {

		if (sum == 0) {
			return;

		}

		int a = sum / arr[i]; // a =몫을 저장.

		sum -= arr[i] * a;

		count += a;

		coinCheck(i - 1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sum = m;

		arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}
		
		coinCheck(n-1);
		
		System.out.println(count);

	}

}
