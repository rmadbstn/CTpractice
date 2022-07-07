package Sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon18870 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] originArr = new int[N];
		int[] sortedArr = new int[N];
		
		
		HashMap<Integer,Integer> rankMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<N;i++) {
			sortedArr[i]=originArr[i] = sc.nextInt();
		}
		
		Arrays.sort(sortedArr);
		int rank=0;
		for(int i:sortedArr) {
			
			if(!rankMap.containsKey(i)) {
				rankMap.put(i, rank);  
				rank++;                    
			}
			
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key:originArr) {
			int resultRank = rankMap.get(key);
			sb.append(resultRank).append(' ');
		}
		
		System.out.println(sb);
		
		
		
		
		
		
	}

}
