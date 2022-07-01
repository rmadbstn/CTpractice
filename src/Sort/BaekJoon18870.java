package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon18870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String text = br.readLine();
		String[] word = text.split(" ");
		
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=Integer.parseInt(word[i]);			
		}
		
		
		
		
		
	}

}
