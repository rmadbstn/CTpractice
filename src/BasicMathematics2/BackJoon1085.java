package BasicMathematics2;

import java.util.Scanner;

public class BackJoon1085 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x,y,w,h;                        //x��ǥ�� 0�� �����ų� w�� �����ų� or y��ǥ�� 0�� �����ų�  h�� �����ų� 4������ �ּڰ�.
		
		int result=0;
		
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		result = x;
		
		if(w-x<result) {
			result = w-x;
		}
		if(y<result) {
			result = y;
		}
		if(h-y<result) {
			
			result = h-y;
		}
		System.out.println(result);
		
		
		
	}

}
