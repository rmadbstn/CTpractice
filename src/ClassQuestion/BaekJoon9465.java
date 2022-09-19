package ClassQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9465 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int k = 0; k < T; k++) {

			int N = Integer.parseInt(br.readLine());

			int[][] arr = new int[2][N];
			int[][] dpArr = new int[2][N];

			String[] strArr1 = br.readLine().split(" ");
			String[] strArr2 = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {

				arr[0][i] = Integer.parseInt(strArr1[i]);

				arr[1][i] = Integer.parseInt(strArr2[i]);

			}

			if (N <= 2) {

				if (N == 1) {

					bw.write(Math.max(arr[0][0], arr[1][0]) + "\n");

				} else {

					bw.write(Math.max(arr[0][0] + arr[1][1], arr[1][0] + arr[0][1]) + "\n");

				}

			} else {

				dpArr[0][0] = arr[0][0];
				dpArr[1][0] = arr[1][0];

				dpArr[0][1] = arr[1][0] + arr[0][1];
				dpArr[1][1] = arr[0][0] + arr[1][1];

				for (int i = 2; i < N; i++) {

					dpArr[0][i] = Math.max (dpArr[1][i - 1] + arr[0][i], dpArr[1][i - 2] + arr[0][i]);
					dpArr[1][i] = Math.max(dpArr[0][i - 1] +  arr[1][i], dpArr[0][i - 2] + arr[1][i]);

				}

				bw.write(Math.max(dpArr[0][N - 1], dpArr[1][N - 1]) + "\n");

			}
		}

		bw.flush();
		bw.close();

	}

}
