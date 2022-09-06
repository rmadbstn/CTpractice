package ClassQuestion;

import java.util.Scanner;

public class BaekJoon8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		
		
		for(int j=0;j<t;j++) {
		
		String str = sc.next();
		
		int count=0;
		int sum=0;
		for(int i = 0; i<str.length();i++) {
			
			
			if(str.charAt(i)=='O') {
				count++;
				sum+=count;
			}else {
				count=0;
			}
			
			
		}

		
		System.out.println(sum);
		}
	}

}
