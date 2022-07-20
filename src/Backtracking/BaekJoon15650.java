package Backtracking;

import java.util.Scanner;

public class BaekJoon15650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		 N= sc.nextInt();
		 M= sc.nextInt();
		
		 dfs(0,0, new int[M],new boolean[N]);		
		
	}
	
	static int N,M;
	
	
	public static void dfs(int j,int count,int[] selected,boolean[] visited)
	{
		if(count==M) {
			for(int a : selected) {
				System.out.print(a+" ");
			}
			
			System.out.println();
			return;
		}
		
		for(int i=j; i<N ; i ++) {
				
			if(!visited[i]) {
				visited[i]=true;
				selected[count]=i+1;
				dfs(j=i+1,count+1,selected,visited);
				visited[i]=false;
			}
			
		}
		
	}
}
