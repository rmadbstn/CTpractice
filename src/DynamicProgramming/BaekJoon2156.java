package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon2156 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[10000];

		int dpArr[] = new int[10000];

		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		dpArr[0] = arr[0];
		dpArr[1] = arr[0] + arr[1];
		dpArr[2] =Math.max(Math.max(dpArr[1], arr[0] + arr[2]),arr[1]+arr[2]);	

		for (int i = 3; i < N; i++) {  //Dp(N-2)+arr[N]이 큰경우, Dp(N-3)+arr[N-1]+arr[N]이 큰경우, Dp(N-1)이 가장 큰경우.

			dpArr[i] = Math.max(Math.max(dpArr[i-2], dpArr[i-3]+arr[i-1])+arr[i], dpArr[i-1]);

		}
		
		System.out.println(dpArr[N-1]);
	}
}
