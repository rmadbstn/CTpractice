package ClassQuestion;

import java.util.Scanner;

public class BaekJoon1157 {

	public static void main(String[] args) {

		int[] arr = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		int max=0;
		char maxChar=' ';

		for(int i=0; i<str.length();i++) {
			
			
			arr[str.charAt(i)]= arr[str.charAt(i)]+1;
			
			if(arr[str.charAt(i)]==max) {
				maxChar='?';
			}else if(arr[str.charAt(i)]>max) {
				maxChar = str.charAt(i);
				max = arr[str.charAt(i)];
			}
			
			
			
			
		}
		
		System.out.println(maxChar);
	}

}
