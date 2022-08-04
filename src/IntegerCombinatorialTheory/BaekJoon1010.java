package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon1010 {

	public static void main(String[] args) {  //nCr ->이항계수.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] arr = new long[N][2];
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();		//r
			arr[i][1] = sc.nextInt();     //n      ->nCr
			
			if(arr[i][0]>15) {
				arr[i][0]=arr[i][1]-arr[i][0];
			}
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
