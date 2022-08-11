package DevideAndConquer;

import java.util.Scanner;
 
public class BaekJoon10830 {   //행렬은 결합법칙이 성립한다. 

	static int n;
	static int[][] arr;

	
	public static int[][] partition(long num){
		
		if(num==1) {
			return arr;
		}
		
		int[][] tmp = partition(num/2); //계속 분배된다.   num==1이될떄까지.
		
		
		tmp= yunsu(tmp,tmp);         // 
		
		
		if(num%2==1) {
			tmp  = yunsu(tmp,arr);           //나머지가 1일때 한번더 arr과 연산.
			
		}
		return tmp;
	}
	
	
	public static int[][] yunsu(int[][] arr1,int[][] arr2) {
		
		int[][] tmp = new int[n][n];
		
		for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<n;j++) {
				
				int sum=0;
				for(int k=0;k<n;k++) {
					
				sum+=arr1[i][k]*arr2[k][j];
				sum%=1000;
					
				}
				
				tmp[i][j]=sum;
				
				
				
			}
		}
		
		
		
		return tmp;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt(); // 행렬의 크기.
		long B = sc.nextLong(); // 곱하는 개수.

		arr = new int[n][n];
		int[][] result = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				int a = sc.nextInt()%1000;
				arr[i][j] = a;
				
			}

		}

		result = partition(B);
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {

				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
