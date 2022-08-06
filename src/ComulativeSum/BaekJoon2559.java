package ComulativeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2559 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		int n = Integer.parseInt(strArr[0]);
		int k = Integer.parseInt(strArr[1]);

		int[] culSum = new int[n + 1];
		int sum = 0;
		int max = Integer.MIN_VALUE;

		String[] strArr2 = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {

			sum += Integer.parseInt(strArr2[i]);
			culSum[i + 1] = sum;

		}

		for (int i = 0; i < n - k + 1; i++) {

//			System.out.println(culSum[i + k] + "-" + culSum[i]);

			if (culSum[i + k] - culSum[i] > max) {
				max = culSum[i + k] - culSum[i];

			}
		}

		System.out.println(max);
	}

}
