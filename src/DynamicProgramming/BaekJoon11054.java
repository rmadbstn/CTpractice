package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon11054 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		int[][] dpArr = new int[N][2]; // 0번 증가, 1번은 감소값을 기록.
		int max=1;
		
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();

		}

		dpArr[0][0] = 1;
		dpArr[N-1][1] = 1;

		for (int i = 1; i < N; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j]) {

					dpArr[i][0] = Math.max(dpArr[j][0] + 1, dpArr[i][0]);

				}

			}
			if (dpArr[i][0] == 0) {
				dpArr[i][0] = 1;
			}

		}
		
		
		for (int i = N-2; i >= 0; i--) {

			for (int j = N-1; j >i; j--) {

				if (arr[i] > arr[j]) {

					dpArr[i][1] = Math.max(dpArr[j][1] + 1, dpArr[i][1]);

				}

			}
			if (dpArr[i][1] == 0) {
				dpArr[i][1] = 1;
			}

		}

//		System.out.println(dpArr[N - 1][1]);
		
		
		for(int i = 0; i<N;i++) {
			if(max<dpArr[i][0]+dpArr[i][1]) {
				max = dpArr[i][0]+dpArr[i][1];
			}
			
		}
		System.out.println(max-1);

	}

}
