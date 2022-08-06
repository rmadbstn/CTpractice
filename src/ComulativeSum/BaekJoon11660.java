package ComulativeSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon11660 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] strArr = br.readLine().split(" ");
		
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		
		int[][] arr = new int[n+1][n+1];
		int[][] culArr = new int[n+1][n+1];
		
		
		for(int i=1; i<n+1;i++) {
			
			String[] strArr2 = br.readLine().split(" ");
			for(int j=1; j<n+1;j++) {
				
				arr[i][j] = Integer.parseInt(strArr2[j-1]);
				
			}
			
		}
		
		
		for(int i=1;i<n+1;i++) {
			
			for(int j=1;j<n+1;j++) {
				
				culArr[i][j] = culArr[i-1][j]+culArr[i][j-1]-culArr[i-1][j-1]+arr[i][j];
				
			}
			
			
		}
		
		
		for(int i=0;i<m;i++) {
			
			String[] strArr3 = br.readLine().split(" ");
			
			int x1 = Integer.parseInt(strArr3[0]);
			int y1 = Integer.parseInt(strArr3[1]);
			int x2 = Integer.parseInt(strArr3[2]);
			int y2 = Integer.parseInt(strArr3[3]);
			
			
			
		bw.write(	culArr[x2][y2] - culArr[x1-1][y2] -culArr[x2][y1-1]+culArr[x1-1][y1-1]+"\n");
			
		}
		
		
		bw.flush();
		bw.close();
		
		
		

	}

}
