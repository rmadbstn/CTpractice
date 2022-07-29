package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon1912 {

	static int N;
	static int[] arr;
	static int[] dpArr;
	static int Max = Integer.MIN_VALUE;

	public static void dp(int index) {
		if(index==N) {
			return;
		}
		
		if(dpArr[index-1]>=0) {
		dpArr[index]=dpArr[index-1]+arr[index];
		}else {
			dpArr[index] = arr[index];
		}
		
		if(dpArr[index]>Max) {
			Max=dpArr[index];
		}
		dp(index+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N];
		dpArr = new int[N];
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();

		}
		dpArr[0]=arr[0];
		Max = arr[0];
		dp(1);
		System.out.println(Max);
	}

}
