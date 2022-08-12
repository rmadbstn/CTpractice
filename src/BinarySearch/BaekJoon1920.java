package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1920 {

	static int[] arr;
	static boolean exist = false;
	static int size;
	
	
	public static void partition(int point,int N, int check) {
		

		
		if(arr[point]==check) {
			
			exist = true;
			return;
		}
      
		
		
		if(point == size-1 || point==0) {
			return;
		}
		
		
    
      if (arr[point] < check) {

    	  
    	 if(N==1) {
    		 if(arr[point+N]>check) {
    			 return;
    		 }
    		 partition(point+N,N  , check);
    		 
    	 }else {
    	  
         partition(point+N/2,N / 2 , check);
    	 }
      }

      if (arr[point] > check) {
    	  
    	  
    	  if(N==1) {
    		 if(arr[point-N]<check) {
    			 return;
    		 }
     		 partition(point-N,N  , check);
     	 }else {
     	  

         partition(point-N/2,N/2, check);
     	 }
      }

   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		 arr = new int[N];

		 size =N;
		 

		
		
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();

		}
		
		Arrays.sort(arr);

		int M = sc.nextInt();

		

		for (int i = 0; i < M; i++) {
			
			int a = sc.nextInt();
			
			exist = false;
			partition(N/2,N/2, a);
			if (exist == true) {
				sb.append("1"+"\n");
			} else {
				sb.append("0"+"\n");
			}
		}
		System.out.println(sb);
	}

}