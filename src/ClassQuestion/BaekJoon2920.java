package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2920 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		if (Integer.parseInt(strArr[0]) == 1) {

			for (int i = 1; i < 8; i++) {

				if (Integer.parseInt(strArr[i]) != i + 1) {

					System.out.println("mixed");
					break;
				}

				if (i == 7) {
					System.out.println("ascending");
				}
			}

		} else if (Integer.parseInt(strArr[0]) == 8) {

			for (int i = 1; i < 8; i++) {

				if (Integer.parseInt(strArr[i]) != 8 - i) {

					System.out.println("mixed");
					break;
				}

				if (i == 7) {
					System.out.println("descending");
				}
			}

		} else {

			System.out.println("mixed");
		}

	}

}
