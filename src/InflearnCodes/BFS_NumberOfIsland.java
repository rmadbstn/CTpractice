package InflearnCodes;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_NumberOfIsland {

	public static void main(String[] args) {

		char[][] grid = {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'1','1','1','0','0'},
				{'0','0','0','1','1'},
		};
		
//		char[][] grid = {
//				{'1','0'},
//				{'1','1'}
//		};

		
		
		BFS_NumberOfIsland a = new BFS_NumberOfIsland();
		
		System.out.println(a.solve(grid));
	}
	
	int m,n;
	int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
	
	
	public int solve(char[][] grid) {
		
		if(grid == null || grid.length == 0 || grid[0].length==0)
			return 0;
		
		m=grid.length;//4
		n=grid[0].length;//5
		
		int count=0;
		for(int i =0; i<m; i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]=='1') {
					count++;
					bfs(grid,i,j);
				}
			}
		}
		
		return count;
		
	}
	
	public void bfs(char[][] grid,int x ,int y) {
		
		
		grid[x][y] = 'X'; //visited
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			
			int[] cur = queue.poll();
			
			
			for(int[] dir:dirs) {
				int x1 = cur[0]+dir[0];
				int y1 = cur[1]+dir[1];
				
				if(x1>=0&&y1>=0&&x1<m&&y1<n&&grid[x1][y1]=='1') {
					grid[x1][y1] = 'X';
					queue.offer(new int[] {x1,y1});
				}
				
				
			}
			
			
			
		}
		
		
	}
}
