package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon1904 {
	/*
	 * N개의 타일로 만들 수 있는 경우의 수는
	 * 
	 * ((N-2개의 타일로 만들 수 있는 경우의 수) + (N-1개의 타일로 만들 수 있는 경우의 수) (N-2개의 타일 뒤쪽에 00붙이기)
	 * (N-1개의 타일 뒤쪽에 1 붙이기) = (N-2개의 타일로 만들 수 있는 경우의 수) + (N-1개의 타일로 만들 수 있는 경우의 수)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(tile(n));

	}
	
	public static int tile (int n) {
		int[] arr = new int[n];
		
		if (n == 1)
			return 1;
        
        else if (n == 2)
            return 2;
		
		else {
			arr[0] = 1;	arr[1] = 2;
			for (int i = 2; i < n; i++) {
				arr[i] = (arr[i-1] + arr[i-2]) % 15746;
			}
		}
		
		return arr[n-1];
	}
}


