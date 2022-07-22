package Backtracking;

import java.util.Scanner;

public class BaekJoon9663 {
	static int N;
	static int count;
	static int[] chessBoard;

	static boolean isPossible(int level) {

		if (level == 0) {      // 첫 행에 체스를 두는데는 아무 상관 없음. 
			return true;
		}

		for (int i = 0; i < level; i++) {

			if (chessBoard[level] == chessBoard[i]) { // 같은 열에 체스가 있을 때

				return false;
			}

			if (Math.abs(chessBoard[level] - chessBoard[i]) == level - i) { // 대각선상에 체스가 있을 때

				return false;
			}

		}
		return true;

	}

	static boolean queenSet(int level) {

		if (!isPossible(level)) {											//queen이 있을때 체크. 
			return false;
		} else if (level == N - 1) {

			count++;
			return false; // ->true false 가 의미가 있나?없다. 그저 반환 시켜주기 위함.

		}

		for (int i = 0; i < N; i++) {

			chessBoard[level + 1] = i;

			queenSet(level + 1);

		}

		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		chessBoard = new int[N];

		for (int i = 0; i < N; i++) {
			chessBoard[0] = i;
			queenSet(0);

		}

		System.out.println(count);

	}

}
