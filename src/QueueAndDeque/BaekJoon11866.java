package QueueAndDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Queue<Integer> queue = new LinkedList<>();

		String[] strArr = br.readLine().split(" ");

		int n = Integer.parseInt(strArr[0]);
		int k = Integer.parseInt(strArr[1]);

		for (int i = 1; i < n + 1; i++) {
			queue.offer(i);
		}

		while (!queue.isEmpty()) {
//			System.out.println(queue.size());
			if (queue.size()==n) {
				sb.append("<");
			}

			for (int i = 1; i <= k; i++) {

				if (i == k) {

					sb.append(queue.poll());
				} else {

					queue.offer(queue.poll());
				}

			}

			if (queue.isEmpty()) {
				sb.append(">");
			} else {
				sb.append(", ");
			}

		}

		System.out.println(sb);

	}

}
