package BasicMathematics;


import java.math.BigInteger;
import java.util.Scanner;

public class BaekJoon10757_2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());

		A = A.add(B);
		
		System.out.println(A.toString());
}

}
