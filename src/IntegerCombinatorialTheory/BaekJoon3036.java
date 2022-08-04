package IntegerCombinatorialTheory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon3036 {
	
	static int euclide(int A,int B) {
		
		int r=0;
		
		while(B!=0) {
			
			r=A%B;
			A=B;
			B=r;
			
		}
		return A;
		
	}

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int N = Integer.parseInt(br.readLine());
		
		int a;
		
		String[] strArr = br.readLine().split(" ");
		
		for(int i=1;i<strArr.length;i++) {
			
			a= euclide(Integer.parseInt(strArr[0]),Integer.parseInt(strArr[i]));
			
			bw.write(Integer.parseInt(strArr[0])/a+"/"+Integer.parseInt(strArr[i])/a);
			bw.write("\n");
			
			
		}
		
		
		bw.flush();
		bw.close();
	}

}
