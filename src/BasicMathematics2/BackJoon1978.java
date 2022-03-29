package BasicMathematics2;

import java.util.Scanner;

//소수 찾기
public class BackJoon1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result=0;   //소수의 개수
		
		int count ; 
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			count = 0; 
			
			
			if(arr[i]!=1) {
			
			for(int j=1;j<=arr[i];j++) {
				if((arr[i]%j)==0) {
					count++;
				}
			 }
			}
			if(count==2) {
				result++;
			}
	
		}
		
		
		System.out.println(result);

	}

}
