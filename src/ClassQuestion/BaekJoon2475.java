package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		
		int sum=0;
		
		for(int i=0;i<str.length;i++) {
			
			
			
			sum+=Integer.parseInt(str[i])*Integer.parseInt(str[i]);
			
			
		}
		
		
		System.out.println(sum%10);

	}

}
