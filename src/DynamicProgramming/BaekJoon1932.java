package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1932 {

	static int max;
	
	static int[][] triangle;
	static int[][] dpArr;
	
	
	public static int dp(int N,int index) {
		
		if(dpArr[N][index]==-1) {		//층수로 체크했을시 시간초과가 생김. 체크했던 경로를 다시 체크하는 경우가 발생함. 메모제이션 중요
			
			
			dpArr[N][index] = Math.max(dp(N-1,index),dp(N-1,index+1))+triangle[N][index];
			
			
		}
		
		return dpArr[N][index];
		
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		triangle = new int[N][500];
		dpArr = new int[N][500];
		
		for(int i = 0; i<N ; i++) {
			
			String[] str = br.readLine().split(" ");
			
			for(int j=0;j<i+1;j++) {
				
			
				triangle[N-1-i][j] = Integer.parseInt(str[j]);				//삼각형을 거꾸로해서 첫번째 라인을 바닥값으로 만들었음.
				dpArr[N-1-i][j]=-1;
			}
			
		}
		
		dpArr[0] = triangle[0];     //맨 밑 바닥값 누적값 배열에 등록.
		
		
		
		max =dp(N-1,0);
		
		System.out.println(max);
		
	}
	

	
	
	
	
}


