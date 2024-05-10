package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon16236 {

	static int[][] dirs = { { 1, 0 }, { 0, -1 }, { -1, 0 }, { 0, 1 } };
	static int[][] arr;
	static int sum = 0; // 총 걸리는 시
	static int jaws = 2; // 죠스 초반 크기.
	static int eatCount = 0; // 먹은 갯수 세기.

	static int N;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		
		for(int i=0; i<N; i++) {
			
			String[] strArr = br.readLine().split(" ");
		
			
			for(int j=0; j<N ;j++) {
				
				arr[i][j] = Integer.parseInt(strArr[j]);	
				
				
			}
			
			
			
		}
		

		for(int i=0; i<N ; i++) {
			for(int j=0; j<N; j++) {
				
				if(arr[i][j]==9) {
					
					sea(j,i);
					break;
					
				}
				
			}
		}
		
		System.out.println(sum);
		
	}

	static void sea(int x, int y) { 

		
		
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] {y,x,0});
		
		
		boolean[][] checkArr = new boolean[N][N];
		
		while (!queue.isEmpty()) {

			int[] cur = queue.poll();

			int curTime = cur[2];
			
			int curX = cur[1];
			int curY = cur[0];
			
			System.out.println("X:"+curX+" Y:"+curY);
			
			checkArr[curY][curX] = true;

			for (int[] dir : dirs) {

				int newX = curX + dir[1];
				int newY = curY + dir[0];

				if (newY >= 0 && newX >= 0 && newY < N && newX < N && arr[newY][newX] <= jaws && checkArr[newY][newX]==false) {
					
					curTime++;
					
					
					if(arr[newY][newX] != jaws && arr[newY][newX]!=0) {
						eatCount++;
						arr[newY][newX]=0;
						if(eatCount==jaws) {
							checkArr = new boolean[N][N];
							eatCount = 0;
							jaws++;
							
						}
						sum += curTime;
						curTime=0;
					}
					
					queue.offer(new int[] {newY,newX,curTime});
					
					
					
					
				}

			}

		}

	}

}
