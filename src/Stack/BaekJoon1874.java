package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean yesNo = true;

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(br.readLine());

		}

		int point = 0;

		for (int a : arr) {

			if (a > point) {

				for (int i = point + 1; i <= a; i++) {

					stack.push(i);
					sb.append("+"+"\n");
					if (i == a) {
						stack.pop();
						sb.append("-"+"\n");
					}

				}
				point = a;

			} else {

				if (a != stack.peek()) {
					System.out.println("NO");
					return;
//					yesNo = false;
//					break;
				} else {

					stack.pop();
					sb.append("-"+"\n");

				}
			}

		}
//		if (yesNo == true) {
		System.out.println(sb);
//		}
	}

}
