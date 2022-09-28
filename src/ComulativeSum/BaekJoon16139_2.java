package ComulativeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon16139_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		
		String str = br.readLine();

		int n = Integer.parseInt(br.readLine());

		int[][] culArr = new int[200001][26];

		for (int i = 0; i < str.length(); i++) {

			int alpha = str.charAt(i)-97;
			
			if(i==0) {
				culArr[i][alpha]=1;
				continue;
			}
			
			for(int j=0;j<26;j++) {
			
			
			culArr[i][j] = culArr[i-1][j];   //배열 복사시에 주소값이 아니라 배열 값만 복사.
			
			
			}
			culArr[i][alpha] = culArr[i-1][alpha]+1;
			

		}

		for (int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int check = st.nextToken().charAt(0)-97;

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0) {
				sb.append(culArr[b][check] + "\n");
				continue;
			}

			sb.append(culArr[b][check] - culArr[a-1][check] + "\n");

		}
		
		System.out.println(sb);
	}

}
