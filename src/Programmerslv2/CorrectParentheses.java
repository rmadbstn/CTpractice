package Programmerslv2;

import java.util.Stack;

public class CorrectParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s = "()()";
	String s = "(())()";
//		String s = ")()(";

		Stack stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			stack.add(s.charAt(i));

		}

		int check = 0;
		while (!stack.isEmpty()) {

			if (stack.pop().equals(')')) {
				check++;
			} else {
				check--;
			}

			if (check < 0) {
				System.out.println("false");
				
				return;
			}

		}
		
		if(check!=0) {
			System.out.println("false");
			return;
		}
		

		System.out.println("true");

	}

}
