package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2178 {

	static int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static int N, M;
	static int count=0;

	public static void yunsu(int[][] maze) {


		Queue<int[]> queue = new LinkedList<>();

		int[] start = {1,1};
		
		queue.offer(start);
		
		while (!queue.isEmpty()) {
		
			
			int[] arr = queue.poll();
			
			int y = arr[0];
			int x = arr[1];
			
			
			if(y==N&&x==M) {
				break;
			}
			
			
			
			
			for (int[] dir : dirs) {
				
				int x1 = x + dir[0];
				int y1 = y + dir[1];
				int[] arr2 = {y1,x1};
				if (x1 <= 0 || x1 > M || y1 <= 0 || y1 > N) {
					continue;
				}
				if (maze[y1][x1] == 1) {
					
					maze[y1][x1]=maze[y][x]+1;
					queue.offer(arr2);
					
				}

			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		int[][] maze = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {

			String[] strArr2= br.readLine().split("");

			
			for(int j=1;j<=strArr2.length;j++) {
				
				
				maze[i][j] = Integer.parseInt(strArr2[j-1]);
				
				
			}
			
			

		}
		yunsu(maze);
		
		System.out.println(maze[N][M]);
	}

}
