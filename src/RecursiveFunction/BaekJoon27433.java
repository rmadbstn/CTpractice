package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27433 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(N));
		
		
	}
	
	static long factorial(int n) {
		
		
		if(n==1 ||n==0) {
			return 1;
		}
		
		return (long)n*factorial(n-1);
		
		
		
	}

}
