package ComulativeSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11659 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strArr = br.readLine().split(" ");
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		
		
		int[] arr = new int[n+1];
		int[] comulSum = new int[n+1];
		
		
		
		String[] strArr2 = br.readLine().split(" ");
		for(int i=0; i<strArr2.length;i++) {
			
			arr[i+1] = Integer.parseInt(strArr2[i]); 
			
		}
		
		int sum = 0;
		
		for(int i=1;i<n+1;i++) {
			sum+=arr[i];
			comulSum[i] = sum;
		}
		
		for(int i=0;i<m;i++) {
			
			
			String[] strArr3 = br.readLine().split(" ");
			
			int a = Integer.parseInt(strArr3[0]);
			int b = Integer.parseInt(strArr3[1]);
			
			bw.write((comulSum[b]-comulSum[a-1])+"\n");
			
			
		}
		
		bw.flush();
		bw.close();
	}

}


