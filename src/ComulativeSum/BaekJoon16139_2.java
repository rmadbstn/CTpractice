package ComulativeSum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon16139_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int n = Integer.parseInt(br.readLine());

		int[][] culArr = new int[200001][26];

		for (int i = 0; i < str.length(); i++) {

			int alpha = str.charAt(i)-97;
			
			if(i==0) {
				culArr[i][alpha]=1;
				continue;
			}
			
			culArr[i] = culArr[i-1].clone();   //배열 복사시에 주소값이 아니라 배열 값만 복사.
			
			culArr[i][alpha] = culArr[i-1][alpha]+1;
			

		}

		for (int i = 0; i < n; i++) {

			String[] strArr = br.readLine().split(" ");

			int check = strArr[0].charAt(0)-97;

			int a = Integer.parseInt(strArr[1]);
			int b = Integer.parseInt(strArr[2]);

			if (a == 0) {
				bw.write(culArr[b][check] + "\n");
				continue;
			}

			bw.write(culArr[b][check] - culArr[a-1][check] + "\n");

		}

		
		bw.flush();
		bw.close();
	}

}
