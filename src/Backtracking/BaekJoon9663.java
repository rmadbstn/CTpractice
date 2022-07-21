package Backtracking;

import java.util.Scanner;

public class BaekJoon9663 {

	public static int N;
	public static int count = 0;
	public static int[] chessCol;


	
	static boolean isPossible(int level) {
		
		for(int i = 1; i<level; i++) {
			
			
			
		}
		
		
	}
	
	
	
	static boolean setQueen(int level) {
		
		if(!isPossible(level)) {
			
			return false;
		}
		
		else if(level == N) {
			
			count++;
			return true;
		}
		
		for ( int i = 0;i<N;i++) {
			chessCol[level] = i;
			setQueen(level+1);
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		chessCol = new int[N];
		
		set
	}

}
