package BruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon1436 {
                           
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N= Integer.parseInt(br.readLine());
		
		String str = "";
		int upNumber=666;
		
		int count=0;
		
		while(count!=N) {
			
			 str = Integer.toString(upNumber);
			if(str.contains("666")) {
				count++;
			}
		upNumber++;
			
			
		}
		
		
		bw.write(Integer.parseInt(str)+"\n");
		bw.flush();
		
		
		
		
	}
	
	
	
	
	/* runtime error*/

	//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		// TODO Auto-generated method stub
//		int N = sc.nextInt();
//		int count = 3;
//		int upNumber = 660;
//		int testNumber;
//		while (true) {
//			testNumber=upNumber;
//			count=3;//6656 
//			while (testNumber>0) {
//				if (testNumber % 10 == 6) { 
//					count--;    
//					if (count == 0) {              
//						N--;                        
//						count=3;                 
//						break;
//						
//					}
//				}else{
//					count = 3;       
//				}
//				
//				
//				testNumber /= 10; 
//				
//			}
//			if (N == 0) {
//				break;
//			}
//			upNumber++;
//		}
//		System.out.println(upNumber);
//	}

}
