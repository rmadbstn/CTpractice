package QueueAndDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> deque = new LinkedList<>();

		String[] strArr = br.readLine().split(" ");

		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);

		String[] strArr2 = br.readLine().split(" ");
		
		
		for (int i = 1; i < n+1; i++) {
			deque.addLast(i);
		}

		int start = 1;
		int end = n;

		int count = 0;
		int index = 0;
		while (true) {

			int x = Integer.parseInt(strArr2[index]); // 위치좌표.

			if (x - start <= end - x) {

				while (deque.peekFirst() != x) {

					deque.addLast(deque.removeFirst());
					end++;
					start++;
					count++;

				}
				System.out.println("left:"+count);
				deque.removeFirst();
				start++;
				index++;

			} else {

				while (deque.peekFirst() != x) {

					deque.addFirst(deque.removeLast());
					end--;
					start--;
					count++;

				}
				deque.removeFirst();
				start++;
				index++;
				System.out.println("right:" +count);
			}
			
//			System.out.println("index: "+index);

			if(index == m) {
				break;
			}
			
		}
		System.out.println(count);
	}

}
