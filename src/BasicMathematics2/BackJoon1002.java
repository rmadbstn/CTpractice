package BasicMathematics2;

import java.util.Scanner;

//터렛
public class BackJoon1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCase;
		int result = 0;
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
	
		testCase = sc.nextInt(); 				//arr[0] x1 ,y1,r1, x2, y2 ,r2
														
		for(int i =0; i<testCase; i++) {
			
			for(int j=0; j<6;j++) {          	 //무한대, 2개, 1개, 0개일경우(3가지경우).
				arr[j]=sc.nextInt();
			}
			if(arr[0]==arr[3]&&arr[1]==arr[4]) {  //좌표가 같을 때
				
				if(arr[2]==arr[5]) { // 원이 똑같은 두개 일 때
					result = -1;	
				}else {
					result = 0;
				}
			}else if(distance(arr[0],arr[3],arr[1],arr[4])<distance2(arr[2],arr[5])) {
				if(distance(arr[0],arr[3],arr[1],arr[4])+Math.min(arr[4], arr[5])==Math.max(arr[4], arr[5])) {//내접할 때
					result = 1 ;
				}else if(distance(arr[0],arr[3],arr[1],arr[4])+Math.min(arr[4], arr[5])<Math.max(arr[4], arr[5])) {
					result = 0;  // 한 원이 다른 원 안에 있을 때
				}
				result = 2;
			}else if(distance(arr[0],arr[3],arr[1],arr[4])>distance2(arr[2],arr[5])) {
				result = 0;
			}else {
				result = 1;  
			}
			System.out.println(result);
		}
		
		
		
		
	}
	static int distance(int x1, int x2, int y1, int y2){
		
		return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
	}
	
	static int distance2(int r1, int r2){
		
		return (r1+r2)*(r1+r2);
		
	}

}
