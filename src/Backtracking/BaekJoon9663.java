package Backtracking;

import java.util.Scanner;

public class BaekJoon9663 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		boolean[][] chessBoard = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			
			for(int j =0;j<N;j++) {
				
				dfs(chessBoard,i,j,1);
				
			}
			
		}
		
		
		System.out.println(count);
		
		
	}	
	
	static int N;
	static int count=0;
	
	
	
	public static void dfs(boolean[][] chessBoard,int x, int y,int queenCount) {
		
		if(queenCount==N) {
			count++;
			return;
		}	
		
		
		
		
		for(int i=0;i<N;i++) {
			
			
			for(int j=0;j<N;j++) {
				
				if(x-i==y-j || x-i==-(y-j) || i==x || j == x || i==x && j == y) {
					chessBoard[i][j]=true;
				}
				
				if(!chessBoard[i][j]) {
					queenCount++;
					
					dfs(chessBoard,i,j,queenCount);
//					queenCount--;
				}
					
				
				
			}
			
			
		}
		
		
		
	}

}
