package DevideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1992 {

	static char[][] arr;

	static StringBuilder sb = new StringBuilder();
	
	public static void paper(int start_x, int end_x, int start_y, int end_y) {
        char check = arr[start_y][start_x];

		for (int y = start_y; y <= end_y; y++) {

			for (int x = start_x; x <= end_x; x++) {

				if (arr[y][x] != check) {
//					System.out.println("check");
					sb.append("("); 
					paper(start_x, (start_x + end_x) / 2, start_y,(start_y+end_y)/2); // 좌측상단.
					paper((start_x + end_x) / 2 + 1, end_x, start_y, (start_y+end_y)/2); // 우측상단.
					paper(start_x, (start_x + end_x) / 2, (start_y+end_y)/2+1, end_y); // 좌측하단.
					paper((start_x + end_x) / 2 + 1, end_x, (start_y+end_y)/2+1, end_y); // 우측하단.
					sb.append(")");
					return;
				}
				
				if(x==end_x&&y==end_y) {
				  //마지막 압축. 
					
					sb.append(check);
				
					return;
				}
				
			}

		}
		
	}

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		arr = new char[n + 1][n + 1];

		for (int i = 1; i < n + 1; i++) { // 초기 종이 설정.

			String str = br.readLine();
			
			for (int j = 1; j < n + 1; j++) {

				arr[i][j] = str.charAt(j-1);

			}

		}

		paper(1,n,1,n);
		System.out.println(sb);
		
	}
}
