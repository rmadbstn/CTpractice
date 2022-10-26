package Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10926 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Name = br.readLine();
		
		
		for(int i=0;i<10;i++) {
		
			System.out.println(i);
			
		}
		
		System.out.println(Name+"??!");
		
		
	}

}
