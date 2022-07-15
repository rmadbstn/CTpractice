package Function;

import java.util.Scanner;

public class BaekJoon1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		int[] arr = new int[3];
		if(n<100) {
			count = n;
		}else{
			count = hansoo(arr,n);
		}
		System.out.print(count);
	}
	
	
	
	
	
	static int hansoo(int[] arr,int n) {
		if(n==1000) {
			n=999;
		}
		int count =0;
		while(n>99) {
			arr[0]= n%10;
			n/=10;
			arr[1]=n%10;
			n/=10;
			arr[2]=n/10;
			
			if(arr[0]-arr[1]==arr[1]-arr[2]) {
				count++;
			}
			
			n--;
	
		
		}
		
		return count;
	}

}
