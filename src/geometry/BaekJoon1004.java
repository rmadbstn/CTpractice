package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		int[] resultArr = new int[testCase];
		
		
		for(int i=0; i<testCase; i++) {
				int count=0;
			String[] str = br.readLine().split(" "); //(x1,y1) , (x2,y2)
			int circles = Integer.parseInt(br.readLine());
			for(int j=0;j<circles;j++) {
				
				String[] xyr = br.readLine().split(" ");// 행성의 좌표와 반지름길이.
				
				if(distance(str[0],str[1],xyr[0],xyr[1])>radius(xyr[2]) && distance(str[2],str[3],xyr[0],xyr[1])>radius(xyr[2])) {
					continue;
				}else if(distance(str[0],str[1],xyr[0],xyr[1])<radius(xyr[2]) && distance(str[2],str[3],xyr[0],xyr[1])<radius(xyr[2])) {
					continue;
				}else {
					count++;
				}
				
			
			
			}
			
			resultArr[i]=count;
			
		}
		
		
		for(int result : resultArr) {
			
			System.out.println(result);
		}
		
		
	}
	
	
	static int radius(String r) {
		
		return Integer.parseInt(r)*Integer.parseInt(r);
		
	}
	
	
	
	static int distance(String a,String b, String c,String d) {
		
		int x1=Integer.parseInt(a);
		int y1=Integer.parseInt(b);
		int x2=Integer.parseInt(c);
		int y2=Integer.parseInt(d);
		
		
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		
		
		
	}

}
