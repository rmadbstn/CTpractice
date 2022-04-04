package RecursiveFunction;

import java.util.Scanner;

public class BackJoon11729 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	
	System.out.println(hanoi(n));
	hanoiWay(n,1,2,3);
	

	}
	
	static int hanoi(int n) {
		
		
		if(n==1) {
			return 1;
		}
		
		
		return 2*hanoi(n-1)+1; //È½¼ö
		
		
	}
	
	static void hanoiWay(int n,int from,int temp, int to) {
		if(n==1) {
			System.out.println(from+" "+to);
		}
		else {
			hanoiWay(n-1,from,to,temp);         //temp ->to  to ->temp
			System.out.println(from+" "+to);
			hanoiWay(n-1,temp,from,to);			//temp ->from from->temp
		}
	}

}
