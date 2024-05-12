package SamSung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon16236 {

	static int[][] dirs = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
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
		System.out.println("jaws:"+jaws);
		
	}

	static void sea(int x, int y) { 

		
		
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] {y,x,0});
		arr[y][x] = 0;
		
		boolean[][] checkArr = new boolean[N][N];
		checkArr[y][x]=true; 
		
		while (!queue.isEmpty()) {

			int[] cur = queue.poll();

			int curTime = cur[2];
			
			int curX = cur[1];
			int curY = cur[0];
			
			System.out.println("X:"+curX+" Y:"+curY+ " curTime:" + curTime);
			
//			checkArr[curY][curX] = true;

			for (int i= 0; i<4; i++) {

				int newX = curX + dirs[i][1];
				int newY = curY + dirs[i][0];

				if (newY >= 0 && newX >= 0 && newY < N && newX < N && arr[newY][newX] <= jaws && checkArr[newY][newX]==false) {
					
					int newTime=curTime+1;
					
					
					if(arr[newY][newX] != jaws && arr[newY][newX]!=0) {
						System.out.println("먹은좌표: "+newX+","+newY+" 걸린시간:"+newTime	);
						eatCount++;
						arr[newY][newX]=0;
						if(eatCount==jaws) {
//							checkArr = new boolean[N][N];
							System.out.println("before jaws eatCount:"+eatCount);							eatCount = 0;
							jaws++;
							
						}
						sum += newTime;
						newTime=0;
						checkArr = new boolean[N][N];
						queue.clear();
						i=4;
					}
					
					checkArr[newY][newX] = true;
					queue.offer(new int[] {newY,newX,newTime});
					
			
					
					
					
					
					
				}

			}

		}

	}

}
