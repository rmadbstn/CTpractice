package ArrayAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon1269 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		
		String[] aArr = br.readLine().split(" ");
		String[] bArr = br.readLine().split(" ");
		
		HashSet<String> set = new HashSet<String>();
		
		
	   for(int i =0;i<Integer.parseInt(strArr[0]);i++) {
		   
		   set.add(aArr[i]);
		   
	   }
	   for(int i =0;i<Integer.parseInt(strArr[1]);i++) {
		   set.add(bArr[i]);
		   
		   
	   }
		
		System.out.println(set.size()-(Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1])-set.size()));
		
	}

}
