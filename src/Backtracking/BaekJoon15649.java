package Backtracking;

import java.util.Scanner;

public class BaekJoon15649 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
	   for(int i=0;i<N;i++) {
		   
		   arr[i] = i+1;
	   }
		
	   dfs(arr,N,M);
	   
	   
	}
	
	
	public int dfs(int[] arr,int N,int M) {
		
		
		for(int a:arr) {
			
			dfs(arr)
			
			
		}
		
		
		
		
	}

}
