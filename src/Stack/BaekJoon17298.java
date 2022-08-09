package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon17298 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Integer> stack = new Stack<Integer>();

		int n = Integer.parseInt(br.readLine());

		String[] strArr = br.readLine().split(" ");
		int[] nges = new int[n];

		for (int i = 0; i < n; i++) {

			while ( !stack.isEmpty()&&Integer.parseInt(strArr[stack.peek()]) < Integer.parseInt(strArr[i]) ) { // 쌓여있는
																												// 작은수들에
																												// 대한
																												// 오큰수들을
																												// 저장.
																												// //인덱스들을
																												// 스택에
																												// 저장.

				nges[stack.pop()] = Integer.parseInt(strArr[i]); // 각 인덱스들에 대하여 nge값들을 저장.

			}

			stack.push(i); // 인덱스들을 저장한다.
			nges[i] = -1; // 초기값 -1을 저장해둔다.

		}

		for (int i = 0; i < n; i++) {

			bw.write(nges[i] + " ");

		}

		bw.flush();

		bw.close();

	}

}
