package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BaekJoon2206 {

	static int[][] arr;
	static int N,M;
	static boolean[][] check;
	static int Min = 1000001;
	static boolean finalCheck = false;
	
	static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
	
	
	public static void bfs() {
		
		boolean[][][] check = new boolean[N+1][M+1][2];
		
		if(N==1&&M==1) {
			
			finalCheck=true;
			Min = 1;
			return;
		}
		
		
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.offer(new int[] {1,1,1,0});
		check[1][1][0] =true;
		check[1][1][1] = true;
		
		boolean end = false;
		
		while(!queue.isEmpty()) {
		
			int[] cur = queue.poll();
			
			
		
		for(int[] dir : dirs) {
			
			int y1 =cur[0] + dir[0];			
			int x1 = cur[1] + dir[1];			
			int distance = cur[2]+1;
			int checkWall = cur[3];
			
			
			if(x1>=1&&y1>=1&&x1<=M&&y1<=N) {
				
				if(checkWall==1 && (arr[y1][x1] ==1||check[y1][x1][1]==true)) {   //벽을 이전에 하나를 부순 경우. 
					continue;
				}else if(checkWall == 0&&check[y1][x1][0]==true) {
					continue;
				}
				
				
				if(x1==M&&y1==N) {
					
					if(distance<Min) {
						Min = distance;
						end = true;
						finalCheck = true;
					}
					
					break;
				}
				
				if(checkWall==0) {//벽을 안부신 경우에 방문여부체크를 해야함.
					 check[y1][x1][0] = true; 
					}else {   //벽을 1개 부신 상태에서의 방문여부를 체크함.
						check[y1][x1][1] = true; 
					}
				
				if(arr[y1][x1] == 1) {
					checkWall=1; //벽을 하나 부심.
					check[y1][x1][1] = true;
				} 
				queue.offer(new int[] {y1,x1,distance,checkWall});
				System.out.println("x1:"+x1+" y1: "+y1);
				
				
				
			}
			
			
		}
		
		if(end == true) {
			break;
		}
		
		
		
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArr = br.readLine().split(" ");

		N = Integer.parseInt(strArr[0]);
		
		M = Integer.parseInt(strArr[1]);
	
	
		
		
	
		arr = new int[N+1][M+1];
		
		for(int i=1;i<N+1;i++) {
			
			
			String str = br.readLine();
			
			for(int j=1;j<M+1;j++) {
				
				

				arr[i][j] = Character.getNumericValue(str.charAt(j-1)); 

				
			}
			
		}
		
		
		bfs();
		
		
		if(finalCheck == true) {
		System.out.println(Min);
		}else {
			System.out.println(-1);
		}
	}

}
