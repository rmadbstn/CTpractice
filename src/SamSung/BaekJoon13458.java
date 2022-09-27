package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13458 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		long result = 0;
		
		int[] arr = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
	
		
		
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		
		int B = Integer.parseInt(st2.nextToken());  //총 감독관이 한 시험장에서 감시 가능한 인원 수.
		int C = Integer.parseInt(st2.nextToken());  //부감독관이 한 시험장에서 감시 가능한 인원 수.
		
		
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st1.nextToken())-B;  //부감독관이 맡아야하는 인원.


			
			if(arr[i]<=0) {
				continue;
			}
			
			if(arr[i]%C==0) {
				result+=arr[i]/C ;
			}else {
				
				result+=(arr[i]/C+1);
			}
			
		
		}
		
		result+=N;
		
		System.out.println(result);
		
		
		
		
	}

}
