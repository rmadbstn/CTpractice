package RecursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon24060 {
	
	static char[] arr= new char[100000];

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		String[] str = br.readLine().split(" ");
		
		int N = str.length;
		
		for(int i=0;i<N;i++) {
			
			int k = Integer.parseInt(str[i]);
			int a = (int)Math.pow(3, k);
			recur(0,a-1,a);
			
		}
		
		
		
		
	}
	
	static void recur(int a, int b,int k) { //시작점, 끝점, 점선의 길
		
	 
		if(k==3) {
			
			arr[a]='-';
			arr[b]='-';
			
			return;
		}
		
		
		recur(a,a+k/3-1,k/3);
		
		recur(a+2*k/3,b,k/3);
		
		
		
	}

}
