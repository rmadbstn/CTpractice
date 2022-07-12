package ArrayAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon10816 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		int a = Integer.parseInt(br.readLine());
		String[] aArr = br.readLine().split(" ");
		
		for(int i=0;i<aArr.length;i++) {
			if(map.containsKey(aArr[i])) {
				
				int k = map.get(aArr[i]);
				map.replace(aArr[i], k+1);
			}else {
			map.put(aArr[i],1);
			}
			
		}
		
		int b = Integer.parseInt(br.readLine());
		String[] bArr = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String bStr:bArr) {
			if(map.get(bStr)==null) {
				sb.append("0"+" ");
			}else {
			sb.append(map.get(bStr)+" ");
			}
			
		}
	
		System.out.println(sb);

	}

}
