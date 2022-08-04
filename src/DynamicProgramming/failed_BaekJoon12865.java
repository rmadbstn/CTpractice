package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class failed_BaekJoon12865 {

	static int maxWeight;
	static int sumWeight;
	static int sumValues;

	static int N;
	static int max;

	static int[][] arr;
	static int[][] dpArr;

	public static void dp(int index, int remainWeight, int sumValues) {

		
		if(index >= N) {
			return;
		}
		
		
		
		
		
		
		for (int i = index; i < N; i++) {
 
			
			
			if (arr[i][0] <= remainWeight) {

				remainWeight -= arr[i][0];     //남은 무게에서 사물의 무게를 빼고 다음으로 넘김.
				sumValues += arr[i][1];        //그 무게의 사물의 가중치를 더해
				
				if(i !=0) {
					
					dpArr[i][remainWeight] = Math.max(dpArr[i][remainWeight],dpArr[i-1][remainWeight]); //비어있지 않으면 
					
				}else {
					
					dpArr[i][remainWeight] = Math.max(dpArr[i][remainWeight],sumValues); 
				}
				
				dp(i+1,remainWeight,sumValues);  
				
			}
    
			
			
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		maxWeight = sc.nextInt();

		arr = new int[N][2];
		dpArr = new int[N][100001];

		for (int i = 0; i < N; i++) {

			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}

		dp(0,maxWeight,0);
		
		System.out.println(dpArr[N-1][7]);
		
	}

}
