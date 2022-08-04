package IntegerCombinatorialTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1037 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[] strArr = br.readLine().split(" ");

		long max = 0;
		long min = 1000001;

		for (String str : strArr) {

			if (Integer.parseInt(str) > max) {
				max = Integer.parseInt(str);
			}
			if (Integer.parseInt(str) < min) {
				min = Integer.parseInt(str);
			}

		}

		System.out.println(max * min); // 범위때문에 틀렸다고 할거같음.
	}

}
