package ArrayAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon7785 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String, String> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] strArr = br.readLine().split(" ");
			String k = strArr[0];
			String v = strArr[1];

			map.put(k, v);
		}

		for (Map.Entry<String, String> entry : map.entrySet()) {

			String key = entry.getKey();
			String value = entry.getValue();
			
			if(value.equals("enter")) {
				bw.write(key+"\n");
			}
		
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
