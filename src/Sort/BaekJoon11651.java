package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon11651 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i=0;i<N;i++) {
			String[] strArr = br.readLine().split(" ");
			
			arr[i][1] = Integer.parseInt(strArr[0]);
			arr[i][0] = Integer.parseInt(strArr[1]);
			
		}
		
		Arrays.sort(arr,new Comparator<int[]>(){
			
			@Override
			public int compare(int[] a1,int[] a2) {
				if(a1[0]==a2[0]) {
					return Integer.compare(a1[1],a2[1]);
				}else {
					return Integer.compare(a1[0], a2[0]);
				}
			}
		});
		for(int i=0;i<N;i++) {
			System.out.println(arr[i][1]+" "+arr[i][0]);
		}
	}

}
