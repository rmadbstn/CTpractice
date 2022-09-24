package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14501 {

	static int[][] arr;
	static int N;
	static int[] dpArr;
	static int max = 0;

	public static void dp(int day, int sumValues) {

//		System.out.println("day:" + day + " sumValues:" + sumValues);

		dpArr[day] = sumValues;

		if (dpArr[day] > max) {
			max = dpArr[day];
		}

		for (int i = day + 1; i < N + 1; i++) {

//			System.out.println("day(i):" + i);

			if (i-1 + arr[i][0] <= N && dpArr[i-1+arr[i][0]] < sumValues + arr[i][1]) {

				dp(i-1 + arr[i][0], sumValues + arr[i][1]);

			}

		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1][2];
		dpArr = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {

			String[] str = br.readLine().split(" ");

			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);

		}

		dp(0, 0);

		System.out.println(max);

	}

}
