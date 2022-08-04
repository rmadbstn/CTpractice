package IntegerCombinatorialTheory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class BaekJoon9375 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map ;

		int testCase = Integer.parseInt(br.readLine());
		int checkNum;

		for (int i = 0; i < testCase; i++) {
			map = new HashMap<String, Integer>();

			int N = Integer.parseInt(br.readLine());

			checkNum = 0;

			for (int j = 0; j < N; j++) {

				String[] str = br.readLine().split(" ");
				String[] clothes = new String[31];

				if (map.containsKey(str[1])) {

					map.replace(str[1], map.get(str[1]) + 1);

				} else {

					map.put(str[1], 1);
					checkNum++;

				}

			}

			if (checkNum >= 2 && checkNum != 0) {
				
				int result = 1;

				for (int a : map.values()) {

					result *= (a + 1); // 부위별로 벗는 경우까지 계산.

				}
				bw.write((result - 1) + "\n");   //부위가 여러개일 경우. 
			} else if (checkNum != 0) {
				
				
				for (int a : map.values()) {

					bw.write(+a+"\n");         //부위가 하나일 경우.

				
				}

			}else { 
				bw.write(0+"\n");    //옷이 한벌도 없을 경우.
			} 

		}
		bw.flush();
		bw.close();
	}

}
