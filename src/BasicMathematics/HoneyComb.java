////  <<벌집>> 백준 2292번

package BasicMathematics;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		
		int checkN = 0;

		while(true) {
			if((n)<=1) {
				break;
			}
			count++;            //2~7  8~19 20~37  38~61 
			checkN+=6;         // n에서 6, 12 ,18 ... 값을 차례대로 빼면서 라인 수를 계산
			
			n-=checkN;
		}
		
		System.out.println(count);
		
	}

}
