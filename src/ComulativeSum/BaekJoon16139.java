package ComulativeSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16139 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int n = Integer.parseInt(br.readLine());

		int[][] culArr = new int[150][str.length()];

		for (int i = 0; i < str.length(); i++) {

			int alpha = str.charAt(i);

			if (culArr[alpha][i] != 0) {
				continue;
			}

			for (int j = i; j < str.length(); j++) {

				if (alpha == str.charAt(j)) {

					if (j == 0) {
						culArr[alpha][j] = 1;
					} else {
						culArr[alpha][j] = culArr[alpha][j - 1] + 1;
					}

				} else {
					culArr[alpha][j] = culArr[alpha][j - 1];
				}

			}

		}

		for (int i = 0; i < n; i++) {

			String[] strArr = br.readLine().split(" ");

			int check = strArr[0].charAt(0);

			int a = Integer.parseInt(strArr[1]);
			int b = Integer.parseInt(strArr[2]);

			if (a == 0) {
				bw.write(culArr[check][b] + "\n");
				continue;
			}

//			bw.write(culArr[check][b] + "-" + culArr[check][a - 1] + "\n");
			bw.write(culArr[check][b] - culArr[check][a - 1] + "\n");

		}

		bw.flush();
		bw.close();
	}

}
