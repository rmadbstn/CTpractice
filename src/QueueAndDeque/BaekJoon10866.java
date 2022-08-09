package QueueAndDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon10866 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> deque = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] strArr = br.readLine().split(" ");

			switch (strArr[0]) {

			case "push_front":

				deque.addFirst(Integer.parseInt(strArr[1]));
				break;
			case "push_back":

				deque.addLast(Integer.parseInt(strArr[1]));
				break;
			case "pop_front":

				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.removeFirst() + "\n");
				}
				break;
			case "pop_back":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.removeLast() + "\n");
				}

				break;
			case "size":

				bw.write(deque.size() + "\n");

				break;
			case "empty":

				if (deque.isEmpty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;
			case "front":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.peekFirst() + "\n");
				}

				break;
			case "back":
				if (deque.isEmpty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(deque.peekLast() + "\n");
				}
				break;

			}

		}
		bw.flush();
		bw.close();
	}

}
