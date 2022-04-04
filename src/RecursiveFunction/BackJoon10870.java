package RecursiveFunction;

import java.util.Scanner;
//피보나치 문제
public class BackJoon10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = {0,1};
		
		System.out.println(fibonacci(n));
		
	
	}
	
	static int fibonacci(int n) {
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
