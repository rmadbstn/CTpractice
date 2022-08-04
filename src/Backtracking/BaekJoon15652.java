package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon15652 {

	static int N;
	static int M;
	static int[] arr;
	static int index;

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void yunsu(int[] arr, int index,int preNum) throws IOException {

		if (index == M) {
			for (int i = 0; i < M; i++) {
				bw.write(arr[i]+" ");
			}
			bw.write("\n");
			return;
		}

		for (int i = preNum; i < N + 1; i++) {

			arr[index] = i;
			yunsu(arr, index + 1,i);

		}

	}

	public static void main(String[] args) throws IOException {

//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] strArr = br.readLine().split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);

		arr = new int[M + 1];
		yunsu(arr, 0,1);
		bw.flush();
		bw.close();
	}

}
