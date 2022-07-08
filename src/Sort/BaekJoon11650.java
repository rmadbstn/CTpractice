package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class BaekJoon11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			HashMap<Integer,Integer> xyMap = new HashMap<Integer,Integer>();
			int N = Integer.parseInt(br.readLine());
			
			int[] xArr= new int[N];
			int[] yArr= new int[N];
			
			int[] resultXArr = new int[N]; 
			int[] resultYArr = new int[N]; 
			
			for(int i=0; i<N;i++) {
				String[] strArr = br.readLine().split(" ");
				xArr[i] = Integer.parseInt(strArr[0]);
				yArr[i] = Integer.parseInt(strArr[1]);				
				
				xyMap.put(yArr[1], xArr[0]);
			}
			
			
			
			
	}

}
