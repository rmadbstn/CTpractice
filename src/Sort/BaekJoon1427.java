package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1427 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split("");
		
		Arrays.sort(strArr);
		StringBuilder sb = new StringBuilder();
		for(int i=strArr.length-1 ; i>=0;i--) {
			sb.append(strArr[i]);
		}
		System.out.println(sb);
	}

}
