package ClassQuestion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon5525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int cnt = 0;

		String str = br.readLine();
		for (int i = 0; i <= m - (1 + 2 * n); i++) {
			if (str.charAt(i) == 'I') {
				int leng = 0;
				for (int j = i + 1; j < m - 1; j += 2) {
					if (str.charAt(j) == 'O' && str.charAt(j + 1) == 'I') {
						leng++;
						i = j - 1;
					} else
						break;
				}
				if (leng >= n)
					cnt += leng - n + 1;
			}
		}
		System.out.println(cnt);
	}
}