package RecursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2447 {

	static char[][] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer("");
		
		String result = "";

		int N = Integer.parseInt(br.readLine());

		arr = new char[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = ' ';
			}
		}
		star(N, 0, 0);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

//				result += arr[i][j];
				bw.append(arr[i][j]);
				
			}
			bw.append("\n");
//			result += "\n";
		}

//		System.out.println(bw);
		
		bw.flush();
		br.close();
		bw.close();

	}

	static void star(int k, int x, int y) { // 현재 별이 담긴 박스의 크기와 별을 찍기 위한 xy의 시작좌표 또한 알아야함

		// 전체 칸을 9등분 하여 가운데를 제외하고 다시 재귀 함수 돌리기.

		if (k == 1) {
			arr[y][x] = '*';
			return;
		}

		for (int i = 0; i < k; i += k / 3) {

			for (int j = 0; j < k; j += k / 3) {

				if (i == k / 3 && j == k / 3) {
					continue;
				}

				star(k / 3, x + j, y + i);

			}

		}

	}

}
