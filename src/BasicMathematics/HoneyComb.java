////  <<����>> ���� 2292��

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
			checkN+=6;         // n���� 6, 12 ,18 ... ���� ���ʴ�� ���鼭 ���� ���� ���
			
			n-=checkN;
		}
		
		System.out.println(count);
		
	}

}
