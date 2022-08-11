package DevideAndConquer;

import java.util.Scanner;

public class BaekJoon1629 {          // ( a * b) % c = (a % b * b%c)%c

	static int a, b, c;

	public static long yunsu(long a, long b) {
		if(a==1||b==1) {
			return a%c;
		}
		
		long temp = yunsu(a,b/2);
		
		if(b %2 ==1)
			return (temp*temp%c)*a%c;
		
		return temp*temp%c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt(); // a를 곱하는 수.
		c = sc.nextInt(); // a의 b제곱을 나누는 수.
		
		System.out.println(yunsu(a,b));

	}

}
