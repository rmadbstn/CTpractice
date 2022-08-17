package ClassQuestion;

import java.util.Scanner;

public class BaekJoon1003 {

	static int[] zeroArr = new int[41];
	static int[] oneArr = new int[41];

	public static void dp(int N) {

		zeroArr[0] = 1;
		oneArr[0] = 0;
		zeroArr[1] = 0;
		oneArr[1] = 1;

		
		for(int i=2;i<N+1;i++) {
			
			
		zeroArr[i] = zeroArr[i - 1] + zeroArr[i - 2];
		oneArr[i] = oneArr[i - 1] + oneArr[i - 2];
		
		
		}
		
		

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] arr = new int[T];
		
		int max = 0;
		for(int i=0;i<T;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>max) {
				max = arr[i];
			}
		
		}
		dp(max);
		
		
		for(int i=0;i<T;i++) {
			System.out.println(zeroArr[arr[i]]+" "+oneArr[arr[i]]);
		
		}
		

	}

}
