package ClassQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BaekJoon11725  {
	
	static LinkedList<Integer>[] list;
	static int[] result ;
	
	public static void dfs(int num){
		
		if(list[num].size()==0) {
			return;
		}
		
		
		for(int i : list[num]) {
		
			result[i] = num;
			
			list[i].remove(list[i].indexOf(num));
			
			dfs(i);
				
				
			}
			
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(" ");
		
		int N = Integer.parseInt(strArr[0]);
		result = new int[N+1];
		
		list = new LinkedList[N + 1];
		
		for(int i=1;i<=N;i++) {
			
			list[i] = new LinkedList<>();
			
		}
		
		
		int[][] arr = new int[N][2];
		
		for(int i=1;i<N;i++) {
			
			
			String[] strArr2 = br.readLine().split(" ");
			
			int A = Integer.parseInt(strArr2[0]);
			int B = Integer.parseInt(strArr2[1]);
			
			list[A].add(B);
			list[B].add(A);
			
			
		}
		
		
		
		dfs(1);
		
		for(int i=2;i<=N;i++) {
			
			System.out.println(result[i]);
			
		}
		
	}

}
