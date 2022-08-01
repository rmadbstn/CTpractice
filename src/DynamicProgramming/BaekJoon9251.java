package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr1 = br.readLine().split("");				

		String[] arr2 = br.readLine().split("");

		int[][] dpArr = new int[arr1.length + 1][arr2.length + 1];		//2중 배열로 만들어 생각.
																					
																					
		int index = -1;
		int max = 0;

		for (int i = 0; i < arr1.length+1 ; i++) {

			for (int j = 0; j < arr2.length+1 ; j++) {
				
				if(i==0||j==0) {
					dpArr[i][j]=0;
				}else
				if (arr1[i-1].equals( arr2[j-1])) {
					dpArr[i][j] = dpArr[i - 1][j - 1] + 1;
//					System.out.println("check");
					
				} else {

					dpArr[i][j] = Math.max(dpArr[i][j - 1], dpArr[i - 1][j]);

				}

				if (dpArr[i][j] > max) {
					max = dpArr[i][j];
				}

			}

		}
 
		System.out.println(max);

	}

}
