package DevideAndConquer;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon2630 {

	static int[][] arr;
	static int blueCount = 0; // 1로 찬 사각형 종이의 개수.
	static int whiteCount = 0; // 0로 찬 사각형 종이의 개수.

	public static void paper(int start_x, int end_x, int start_y, int end_y) {

		int check = arr[start_y][start_x];

		for (int y = start_y; y <= end_y; y++) {

			for (int x = start_x; x <= end_x; x++) {

				if (arr[y][x] != check) {

					paper(start_x, (start_x + end_x) / 2, start_y,(start_y+end_y)/2); // 좌측상단.
					paper((start_x + end_x) / 2 + 1, end_x, start_y, (start_y+end_y)/2); // 우측상단.
					paper(start_x, (start_x + end_x) / 2, (start_y+end_y)/2+1, end_y); // 좌측하단.
					paper((start_x + end_x) / 2 + 1, end_x, (start_y+end_y)/2+1, end_y); // 우측하단.
					return;
				}
				
				if(x==end_x&&y==end_y) {
					
					if(check==1) {
						blueCount++;
					}else {
						whiteCount++;
					}
					
					return;
				}
				
			}

		}
		
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n + 1][n + 1];

		for (int i = 1; i < n + 1; i++) { // 초기 종이 설정.

			for (int j = 1; j < n + 1; j++) {

				arr[i][j] = sc.nextInt();

			}

		}

		paper(1,n,1,n);
		System.out.println(whiteCount);
		System.out.println(blueCount);
		
	}
}
