package Backtracking;

import java.util.Scanner;

public class BaekJoon14889 {

	static int[][] startLink;

	static int N;
	static int min = Integer.MAX_VALUE;
	static int result = 0;
	static int index = 0;
	static boolean[] check;

	public static void gapResult(int[] arr) {		//나열된 인덱스를 반으로 나누어 startLink값의 차이를 구함.
		result = 0;
		for (int i = 0; i < (N / 2) ; i++) {		

			for (int j = 0; j <( N / 2)  ; j++) {
				if (j != i) {
					result += (startLink[arr[i]][arr[j]] );
				}
			}
		}

		for (int i = N / 2; i < N ; i++) {

			for (int j = N / 2 ; j < N ; j++) {
				if (j != i) {
					
					result -= (startLink[arr[i]][arr[j]]);
				}
			}
		}
		
		result = Math.abs(result);

		

		if (result < min) {
			min = result;
			for(int i:arr) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}

	}

	public static void min(int[] arr, int index, boolean[] check,int k) {
		if (index == N) {

			gapResult(arr);

			return;
		}
		
		if(index==N/2) {		//인덱스를 3개단위로 중복없이 나엻함. ( 1,3,2)->(1,2,3)은 같음.
			k=0;
		}

		for (int i = k; i < N; i++) {
			
			
			
			if (!check[i]) {

				arr[index] = i;
				check[i] = true;
				min(arr, index + 1, check,i);				//인덱스를 0부터 N-1까지 나열하는 경우들.
				check[i] = false;

			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		startLink = new int[N][N];

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				startLink[i][j] = sc.nextInt();

			}

		}

		min(new int[N], 0, new boolean[N],0);

		System.out.println(min);
	}

}
