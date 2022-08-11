package DevideAndConquer;

import java.util.Scanner;

public class BaekJoon11444 {  //메모장 피보나치 행렬식 참고. 
	
	
	static int div = 1000000007;
	
	static long[][] fibArr ;
	
	

	
	public static long[][] matrix(long[][] arr1,long[][] arr2){
		
		
		long[][] tmp = new long[2][2];
	
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
					long sum = 0;
				for(int k=0;k<2;k++) {
					
					sum+=(arr1[i][k])*(arr2[k][j]);
					sum%=div;
					
				}
				
				tmp[i][j]=sum%div;
				
			}
			
		}
		
		
		return tmp;
		
		
	}
	
	
	public static long[][] partition ( long n) {
		
		if(n==1) {
			return fibArr;
		}
		
		
		long[][] tmp = partition(n/2);
		
		tmp = matrix(tmp,tmp);
		
		
		if(n%2==1) {
			
			tmp = matrix(tmp,fibArr);
			
		}
		
		
		return tmp;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		long n = sc.nextLong();
		fibArr = new long[2][2];
		fibArr[0][0] = 1;
		fibArr[0][1] = 1;
		fibArr[1][0] = 1;
		fibArr[1][1] = 0;
		
		long[][] result = partition(n);
		System.out.println(result[0][1]);
	}

}
