package GreedyAlgorithm;

import java.util.Scanner;

public class BaekJoon13305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sumPrices = 0;
		
		int min ;
		
		int[] distances = new int[n-1];
		
		int[] prices = new int[n];
		
		for(int i=0;i<n-1;i++) {
			distances[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			prices[i] = sc.nextInt();
		}
		
		
		min = prices[0];
		
		for(int i=0;i<n-1;i++) {
			
			if(prices[i]<min) {
				min = prices[i];
			}
			
			
			sumPrices += (long)min*distances[i];
			
			
		}
		
		
		System.out.println(sumPrices);
		
		
		
		
	}

}
