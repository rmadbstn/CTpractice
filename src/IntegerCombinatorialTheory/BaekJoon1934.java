package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon1934 {
	static int minValues(int A, int B) {    //최소공배수 
		
		return B* A/maxValues(A,B);
		
	}

	static int maxValues(int A, int B) {    //최대공약수  

		int r =0;
		while(B!=0) {
			
			r=A%B;
			
			A=B;
			B=r;
					
			
		}
		return A;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr =new int[N];
		int a,b;
		for(int i=0;i<N;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			arr[i]=minValues(a,b);
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}

}
