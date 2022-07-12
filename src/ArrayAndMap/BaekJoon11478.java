package ArrayAndMap;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon11478 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<str.length();i++) {
			for(int j=0;j<str.length()-i;j++) {
				set.add(str.substring(j,j+i+1));
				
				
			}
		
		}
		System.out.println(set.size());
	}

}
