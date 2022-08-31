package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String[] strArr = br.readLine().split(" ");
		int A = Integer.parseInt(strArr[0]);
		int B = Integer.parseInt(strArr[1]);
		int V = Integer.parseInt(strArr[2]);
		
		
		int temp = (V-A)/(A-B);
		
		if((V-A)>temp*(A-B)) {
			
			System.out.println(temp+2);
		}else {
			System.out.println(temp+1);
			
		}
		
		
		
		
	}

}
