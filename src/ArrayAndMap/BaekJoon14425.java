package ArrayAndMap;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon14425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count= 0;
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<a;i++) {
			
			set.add(sc.next());
			
		}
		for(int i=0;i<b;i++) {
		 String k=	sc.next();
		 if(set.contains(k)) {
			 count++;
		 }
		}
		
		System.out.println(count);
	
	}

}
