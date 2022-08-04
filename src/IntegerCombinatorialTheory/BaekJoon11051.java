package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon11051 {
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

		dpArr[n][r] = (dp(n - 1, r - 1) + dp(n - 1, r))%10007;

		return dpArr[n][r];

	}

	public static void main(String[] args) {  //nCr ->이항계수.

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r=  sc.nextInt();
		
		 dpArr = new int[n+1][r+1];
		
		
		
		System.out.println(dp(n,r));
	}

}
