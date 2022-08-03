package DynamicProgramming;

import java.util.Scanner;

public class BaekJoon9184 {

	static String[] dpArr;
	
	
	public static int w(int a,int b,int c) {
		
		
		
		
		if (a <= 0 || b <= 0 || c <= 0) {
			return 1; 
		}
		    
		else if (a > 20 || b > 20 || c > 20) {
			dpArr[20*20*20+20*20+20]=Integer.toString(w(20,20,20));
			return w(20,20,20);
		}
		
		else if(dpArr[a*20*20+b*20+c]!=null) {
			return  Integer.parseInt(dpArr[a*20*20+b*20+c]);
		}
		
		
		
		else if (a < b && b < c) {
			dpArr[a*20*20+b*20+c]=Integer.toString(w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
		    return w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);}

		else 
			dpArr[a*20*20+b*20+c]=Integer.toString(w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1));
		    return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		dpArr = new String[8421];
		
		int a=0,b=0,c=0;
		
		while(true) {
		
		
			
			
	     a = sc.nextInt();
	     b = sc.nextInt();
	     c = sc.nextInt();
	    
	     if(a==-1&&b==-1&&c==-1) {
				break;
			}
	     
	    System.out.print("\nw("+a+", "+b+", "+c+") = "+w(a,b,c));
		
	   
	   }
	}
}
