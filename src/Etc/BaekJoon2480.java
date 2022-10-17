package Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2480 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");
		
		int[] arr = new int[3];
		
		arr[0] = Integer.parseInt(strArr[0]);
		arr[1] = Integer.parseInt(strArr[1]);
		arr[2] = Integer.parseInt(strArr[2]);
		
		int result =0;
		
		if(arr[0]==arr[1]){
			result++;
		}else {
			if(arr[1]==arr[2]){
				result++;
			}
		}
		
		if(arr[0]==arr[2]) {
			result++;
		}
		
		
		int finalResult = 0;
		
		if(result == 2) {
			finalResult = 10000+arr[0]*1000;
		}else if(result == 1) {
			Arrays.sort(arr);
			finalResult = 1000+arr[1]*100;
		}else {
			Arrays.sort(arr);
			finalResult = 100*arr[2];
		}
		
		System.out.println(finalResult);
		
		
		
	}

}
