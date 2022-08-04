package IntegerCombinatorialTheory;

import java.util.Scanner;

public class BaekJoon11050 {

	public static void main(String[] args) {  //nCr ->이항계수.

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		int result = 1;
		
		for(int i=0;i<r;i++) {
			result*=(n-i);
		}
		for(int i=0;i<r;i++) {
			result/=(r-i);
		}
		
		System.out.println(result);
	}

}
