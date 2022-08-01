package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		int[] dpArr = new int[N];

		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();
			dpArr[i]=1;
		}

		int max = 1;
		
		
		

		for (int i = 1; i < N ; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j]) {

					dpArr[i]=Math.max(dpArr[i],dpArr[j]+1);		
					
					if(dpArr[i]>max) {
						max = dpArr[i];
					}

				}

			}

		}
		
		
		System.out.println(max);
		

	}

}
