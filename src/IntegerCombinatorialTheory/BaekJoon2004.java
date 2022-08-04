package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon2004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt(); // 들어가는 2와 5의개수 체크해보자. n-m , m, n일때 세가지 경우. n!/(n-m)!m!

		int fiveSum = 0;
		int twoSum = 0;

		long checkFive = 5;
		long checkTwo = 2;

		while (checkFive <= n) {

			fiveSum += (n / checkFive);

			checkFive *= 5;

		}

		while (checkTwo <= n) {

			twoSum += (n / checkTwo);

			checkTwo *= 2;

		}

		
//		System.out.println("빼기전 5 개수:"+fiveSum+" 빼기전 2 개수: " +twoSum );
		
		checkFive = 5;
		checkTwo = 2;

		while (checkFive <= n - m) {

			fiveSum -= ((n - m) / checkFive);

			checkFive *= 5;

		}

		while (checkTwo <=n - m) {

			twoSum -= ((n - m) / checkTwo);

			checkTwo *= 2;

		}
		
		
		checkFive = 5;
		checkTwo = 2;

		while (checkFive <= m) {

			fiveSum -= (m / checkFive);

			checkFive *= 5;

		}

		while (checkTwo <=m) {

			twoSum -= (m / checkTwo);

			checkTwo *= 2;

		}

		
		System.out.println(Math.min(fiveSum, twoSum));
	}

}
