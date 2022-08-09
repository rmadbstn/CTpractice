package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<Character>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String str = br.readLine();
			String check = "YES";

			stack.clear();
			for (char a : str.toCharArray()) {

				if (a == '(') {
					stack.push(a);
				} else {

					if (stack.isEmpty()) {

						check = "NO";
						break;
						
					}else {
						
						stack.pop();
					}

				}
			
			}
			if(!stack.isEmpty()) {
				check = "NO";
			}
			
			bw.write(check+"\n");

		}
		bw.flush();
		bw.close();
	}

}
