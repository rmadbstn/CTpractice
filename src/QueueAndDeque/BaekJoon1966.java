package QueueAndDeque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1966 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		
		int testCase = sc.nextInt();
		
		for(int t=0;t<testCase;t++) {
			
			queue.clear();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int count = 0;
			
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {   //인덱스를 큐에 넣어서 비교. 
				
				arr[i] = sc.nextInt();
				queue.offer(i);
				
			}
			
			int[] importances = arr.clone();
			Arrays.sort(importances);
			
			int check = n-1;
			
			while(true) {
				
				
				if(arr[queue.peek()]==importances[check]) {
					
					if(queue.peek()==m) {
						count++;
						System.out.println(count);
						break; 
					}
					
					
					queue.poll();
					count++;
					check--;
					
				}else {
					
					queue.offer(queue.poll());
					
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
