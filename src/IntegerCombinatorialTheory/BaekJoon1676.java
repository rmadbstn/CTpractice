package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon1676 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N == 0) {
			System.out.println(0);
		} else {
			System.out.println(N / 5 + N / 25 + N / 125); // 5가 몇개 들어있는지에 따라 개수가 정해진다.
		}
	}
}
