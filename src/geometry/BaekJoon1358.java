package geometry;

import java.util.Scanner;

public class BaekJoon1358 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int count = 0;
		int x=0,y=0;
		for(int i= 0;i<5;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<arr[4];i++) {
			
			x= sc.nextInt();
			y= sc.nextInt();
			
			if(centerCheck(arr,x,y)) {
				count++;
			}else if(twoDistanceCheck(arr,x,y)) {
				
				count++;
			}
			
			
			
			
		}
		System.out.println(count);
		
	}
	
	
	static boolean centerCheck(int[] arr,int x,int y) {
		
		if((x>=arr[2]&&x<=arr[2]+arr[0])&&(y>=arr[3]&&y<=arr[3]+arr[1])) {
			
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
	
	static boolean twoDistanceCheck(int[] arr,int x,int y) {
		
	int x1=arr[2],x2=arr[2]+arr[0];
	
	int y1=arr[3]+arr[1]/2;
	int y2=y1;
	
	int r = arr[1]/2;
		
		
		if((distance(x1,y1,x,y)<=r*r)||(distance(x2,y2,x,y)<=r*r)) {
			
			return true;
		}else {
			return false;
		}
		
	
			
		
	}
	
	
	static int distance(int x,int y,int x1,int y1)
	{
		
		return (x-x1)*(x-x1)+(y-y1)*(y-y1);
		
		
	}
	
	

}
