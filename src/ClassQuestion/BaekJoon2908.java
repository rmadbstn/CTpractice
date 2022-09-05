package ClassQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BaekJoon2908 {
	
	public static int reverse(int num) {
		
		int newNum = 0;
		
		newNum+=(num%10)*100 ;
		num -= num%10;
		newNum+=num%100;
		newNum+=num/100;
		
		return newNum;
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(Math.max(reverse(A), reverse(B)));
		
	}

}
