package ClassQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1697 {

	static boolean[] dpArr = new boolean[200001];
	static int N, K;
	static int count = 0;

	public static void bfs(int N, int K) {
		
		Queue<int[]> queue = new LinkedList<>();
		
		int[] arr = {K,0};
		
		queue.offer(arr);
		
		while(true) {
			
			
			
			int[] temp = queue.poll();
			
			
			
			
			if(temp[0]<0||dpArr[temp[0]]==true) {
				continue;
			}else {
			dpArr[temp[0]]=true;
			}
//			System.out.println("0: "+temp[0]+" 1: "+temp[1]);
			if(temp[0] == N) {
				count = temp[1];
				break;
			}
			
			
			int[] A = {temp[0]-1,temp[1]+1};
			int[] B = {temp[0]+1,temp[1]+1};
			if(temp[0]%2==0) {
			int[] C = {temp[0]/2,temp[1]+1};
			queue.offer(C);
			}
			queue.offer(A);
			queue.offer(B);
			
			
			
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 수빈 위치
		K = sc.nextInt(); // 동생 위치

		bfs(N,K);
		System.out.println(count);
	}

}
