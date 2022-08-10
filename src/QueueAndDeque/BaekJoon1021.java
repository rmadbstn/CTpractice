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

		for (int i = 1; i < n + 1; i++) {
			deque.addLast(i);
		}


		int sum = 0;
		int count ;
		int index = 0;
		while (true) {

			int x = Integer.parseInt(strArr2[index]); // 위치좌표.
			count=0;
			while (deque.peekFirst() != x) {       //x가 나올때까지 뽑음.

				deque.addLast(deque.removeFirst());
				count++;
				
			}
			deque.poll();
			if(deque.size()-(count-1)>count) {
				sum+=count;
			}else {
				sum+=deque.size()-(count-1);
			}
			index++;
//			System.out.println("index: "+index);

			if (index == m) {
				break;
			}

		}
		System.out.println(sum);
	}

}
