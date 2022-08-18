package ClassQuestion;

import java.util.Scanner;

public class BaekJoon9095 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] dpArr = new int[11];
		
		dpArr[1]=1;
		dpArr[2]=2;
		dpArr[3]=4;
		
		
		for(int i =0;i<T;i++) {
			
			
			int N = sc.nextInt();
		
			for(int j=4;j<=N;j++) {
				
				if(dpArr[j]==0) {
				dpArr[j]=dpArr[j-1]+dpArr[j-2]+dpArr[j-3];
				
				}
			}
			
			System.out.println(dpArr[N]);			
		}
		
	}

}
