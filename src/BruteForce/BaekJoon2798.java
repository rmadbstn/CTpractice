package BruteForce;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2798{
	
	static int temp=0;
	static int sum=0;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		String[] word = text.split(" ");
		int n = Integer.parseInt(word[0]);
		int Max = Integer.parseInt(word[1]);
		String text2 = br.readLine();
		String[] word2 = text2.split(" ");
		int[] ar = new int[n];
		
		
		for(int i =0;i<n;i++)
		{	
			ar[i] = Integer.parseInt(word2[i]);
		}
		
		for(int i = 0;i<n-2;i++)
			for(int j = i+1 ; j<n-1;j++)
				for(int k = j+1; k<n; k++ ) {
					
					if((ar[i]+ar[j]+ar[k])<=Max) {
						
						temp = ar[i]+ar[k]+ar[j];
						if(temp>=sum) {
							sum=temp;
						}
						
					}
					
			
					
				}
		
		
		bw.write(sum+" ");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	
	
}