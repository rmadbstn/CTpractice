package DevideAndConquer;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon2740 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] arr1 = new int[n][m];
			
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<m;j++) {
					
					arr1[i][j] = sc.nextInt();
					
				}
				
			}
			
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int[][] arr2 = new int[a][b];
			
			for(int i=0;i<a;i++) {
				
				for(int j=0;j<b;j++) {
					
					arr2[i][j] = sc.nextInt();
					
				}
				
			}
			
			
			int[][] resultArr = new int[Math.max(n, a)][Math.max(m, b)];
			
			
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<b;j++) {
					
					 int sum = 0;
					for(int k=0;k<m;k++) {
						
						
						sum+=arr1[i][k]*arr2[k][j];
						
					}
					sb.append(sum+" ");
					
				}
				
				sb.append("\n");
			}
			
		System.out.println(sb);
		
	}

}
