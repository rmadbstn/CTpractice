package Programmerslv2;

import java.util.Arrays;

public class CreateMinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1,4,2};
		int[] B = new int[]{5,4,4};
		
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum = 0;
		
		for(int i=0; i<A.length;i++) {
			
			sum+=A[i]*B[B.length-i-1];
			
			
		}

		System.out.println(sum);
	}

}
