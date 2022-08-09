package QueueAndDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i < n + 1; i++) {
			queue.offer(i);
		}
		
		while(queue.size()!=1) {
			
			queue.poll();
			
			if(queue.size()==1) {
				break;
			}
			
			queue.offer(queue.poll());
			
			
			
		}
		System.out.println(queue.poll());
		
	}

}
