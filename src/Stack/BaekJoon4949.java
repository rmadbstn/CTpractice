package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<Character>();

		while (true) {

			String str = br.readLine();
			if(str.length()==1&&str.charAt(0)=='.') {
//				System.out.print("end");
				break;
			}
			String check = "yes";
			stack.clear();
			
			for (char a : str.toCharArray()) {
				if(check=="no") {
					break;
				}
				switch (a) {

				case '(':
					
					stack.push(a);
					break;

				case '[':
					
					stack.push(a);
					break;


				case ')':
					
					if(stack.isEmpty()||stack.peek()!='(') {
						check = "no";
						
					}else {
						stack.pop();
					}
					break;
					
					
				case ']':
					if(stack.isEmpty()||stack.peek()!='[') {
						check = "no";
					}else {
						stack.pop();
					}
					break;
				}

			}
			if(!stack.isEmpty()) {
			check = "no";
		}
			bw.write(check+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
