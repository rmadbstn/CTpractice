package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1541 {

	static boolean check = false; // true이면 +, false 이면 -;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
				
		int sum = 0;
		String temp = "";

		for (int i = 0; i < str.length() + 1; i++) {
			
			if ( i == str.length()||str.charAt(i) == '-' ) {

				String[] strArr = temp.split("\\+");  //그냥 "+"할 경오 오류. \\를 넣어줘야함

				if (check == true) {
					for (int j = 0; j < strArr.length; j++) {

						sum -= Integer.parseInt(strArr[j]);    
					}

				} else {
					
					for (int j = 0; j < strArr.length; j++) {

						sum += Integer.parseInt(strArr[j]);
					}
				}

				temp = "";
				check = true;

			}
			if (i == str.length()||str.charAt(i)=='-') {
				continue;
			}
			temp += str.charAt(i);
		}
		System.out.println(sum);
	}

}
