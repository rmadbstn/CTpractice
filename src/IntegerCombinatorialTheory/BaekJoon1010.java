package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon1010 {
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

	public static void main(String[] args) {  //nCr ->이항계수.

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

