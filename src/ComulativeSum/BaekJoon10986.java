package ComulativeSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10986 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strArr = br.readLine().split(" ");

		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);

		int[] culArr = new int[m];
		int sum=0;
		long resultSum=0;
		
		String[] strArr2 = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {

	 	 sum = (sum+ Integer.parseInt(strArr2[i]))%m;
		
	 	 culArr[sum]++;   //누적합의 나머지 값의 개수를 계속 더하며 저장.  ->누적합의 나머지가 같은것끼리 개수를 세면된다.->차이가 m의배
	 	 
	 	 if(sum%m==0) {  //나머지가 0인 친구들은 독자적으로도 나누어떨어지기 때문에 미리 더해줌.
	 		 resultSum++;
	 	 }
	 	 
		}
		
		for(int i=0;i<m;i++) {
			
			resultSum+=(long)culArr[i]*(culArr[i]-1)/2;  //2가지 지점을 구간으로 정하기 때문에 nC2가 된다. N개중 2개뽑기.
					
			
		}

		
		
		
		
		System.out.println(resultSum);
		
		
	}

}
