package InflearnCodes;

public class DFS_NumberOfIsland {

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
		
		DFS_NumberOfIsland a = new DFS_NumberOfIsland();
		System.out.println(a.solve(grid));
		
		
	}
	
	
	int m,n;
	int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
	
	
	public int solve(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length ==0)
			return 0;
		
		m = grid.length; //4
		n = grid[0].length; //5
		int count = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]=='1') {
					
					count++;
					dfs(grid,i,j);
					
				}
			}
			
		}
		
		return count;
	}
	
	public void dfs(char[][] grid, int i,int j) {
		//error check
		if(i<0||i>=m||j<0||j>=n||grid[i][j] !='1')
			return;
		
		grid[i][j]='X'; //visited 방문처리.
		
		for(int[] dir: dirs)
			dfs(grid,i+dir[0],j+dir[1]);
	}
	
	

}
