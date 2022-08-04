package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon2609 {
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

		int A = sc.nextInt();

		int B = sc.nextInt();

		
		System.out.println(maxValues(A,B));
		System.out.println(minValues(A,B));
		
	}

}
