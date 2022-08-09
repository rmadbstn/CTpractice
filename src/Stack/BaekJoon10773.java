package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon10773 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int sum=0;
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			int a = sc.nextInt();
			
			if(a!=0) {
				stack.push(a);
			}else {
				stack.pop();
			}
			
			
		}
		
		while(!stack.isEmpty()) {
			
			
			
			
			sum+=stack.pop();
		}
		
		System.out.println(sum);
	}

}
