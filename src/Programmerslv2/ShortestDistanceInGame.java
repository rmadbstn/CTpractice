package Programmerslv2;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInGame {

	static int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	static int[][] checkArr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
				{ 0, 0, 0, 0, 1 } };

		System.out.println(bfs(maps));

	}

	public static int bfs(int[][] maps) {

		int n = maps.length;
		int m = maps[0].length;

		checkArr = new int[n][m];
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] { 0, 0 });
		queue.offer(new int[] { n - 1, m - 1 });
		
		while (!queue.isEmpty()) {

			int[] cur = queue.poll();
			int curX = cur[1];
			int curY = cur[0];
			
			maps[curY][curX]= 0;


			checkArr[curY][curX] += 1;

			for (int[] dir : dirs) {

				int newX = curX + dir[1];
				int newY = curY + dir[0];

				if (newX < m && newY < n && newX >= 0 && newY >= 0 && maps[newY][newX] == 1) {
					
					if(checkArr[newY][newX]!=0) {
						
						System.out.println("("+newX+","+newY+"),("+curX+","+curY+")");
						System.out.println(checkArr[newY][newX]+" "+checkArr[curY][curX]);
						return checkArr[newY][newX]+checkArr[curY][curX];
						
					}
					checkArr[newY][newX]=checkArr[curY][curX];
					queue.offer(new int[] { newY, newX});
				}

			}

		}

		return -1;
	}

}
