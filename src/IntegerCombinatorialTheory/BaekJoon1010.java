package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon1010 {
<<<<<<< HEAD
	static int[][] dpArr;

	public static int dp(int n, int r)

	{
	
		if(dpArr[n][r]!=0) {
			return dpArr[n][r];
		}
		
		
		
		if(r==0 || n==r) {
			dpArr[n][r] =1;
			return dpArr[n][r];
		}
		
		if(r==1) {
			
			dpArr[n][r] =n;
			return dpArr[n][r];
		}

		dpArr[n][r] = (dp(n - 1, r - 1) + dp(n - 1, r));

		return dpArr[n][r];

	}

	public static void main(String[] args) {  //nCr ->ì´í•­ê³„ìˆ˜.

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		dpArr = new int[30][30];
		
		for(int i=0;i<N;i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		
	
		for(int i=0;i<N;i++) {
			System.out.println(dp(arr[i][0],arr[i][1]));
		}
		
		
		
		
		
		
	}

}

=======

	public static void main(String[] args) {  //nCr ->ÀÌÇ×°è¼ö.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] arr = new long[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();		//r
			arr[i][1] = sc.nextInt();     //n      ->nCr
		}
		
		for(int j=0;j<N;j++) {
		
		long result = 1;
		
		for(int i=0;i<arr[j][0];i++) {
			result*=(arr[j][1]-i);
		}
		for(int i=0;i<arr[j][0];i++) {
			result/=(arr[j][0]-i);
		}
		
		System.out.println(result);
		}
	}

}
>>>>>>> b41c10c94c805d641d37ef2b6007c586b711791a
