package ClassQuestion;

import java.util.Scanner;

public class BaekJoon11726 {

	static int[] dpArr = new int[1001];

	public static int yunsu(int N) {

		if (dpArr[N] != 0) {
			return dpArr[N];
		}

		dpArr[N] = (yunsu(N - 1) % 10007 + yunsu(N - 2) % 10007) % 10007;

		return dpArr[N];

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		dpArr[1] = 1;
		dpArr[2] = 2;

		System.out.println(yunsu(N));
	}

}