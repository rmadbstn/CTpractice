package BruteForce;

import java.util.Scanner;

public class BaekJoon1436 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int N = sc.nextInt();
		int count = 3;
		int upNumber = 660;
		int testNumber;
		while (true) {
			testNumber=upNumber;
			count=3;//6656 
			while (testNumber>0) {
				if (testNumber % 10 == 6) { 
					count--;    
					if (count == 0) {              
						N--;                        
						count=3;                 
						break;
						
					}
				}else{
					count = 3;       
				}
				
				
				testNumber /= 10; 
				
			}
			if (N == 0) {
				break;
			}
			upNumber++;
		}
		System.out.println(upNumber);
	}

}
