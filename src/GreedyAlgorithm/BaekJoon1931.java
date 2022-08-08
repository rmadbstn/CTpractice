package GreedyAlgorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon1931 {
	


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		
		for(int i=0;i<n;i++) {
			
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
		}
		
		
		Arrays.sort(arr,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a1,int[] a2) {
				
				if(a1[1]==a2[1]) {
					
					return Integer.compare(a1[0],a2[0]);
				}else {
					return Integer.compare(a1[1],a2[1]);
				}
				
				
			}
			
		});
		
		int count = 0;
		int point = 0;
		for(int i=0;i<n;i++) {
			
			if(arr[i][0]>=point) {
				count++;
				point = arr[i][1];
			}
			
		}
		
		
		System.out.println(count);
		
	}

}
