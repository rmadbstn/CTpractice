package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon10814 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		String[][] members = new String[N][2];
		
		
		
		for(int i=0;i<N;i++) {
			
			String[] strArr = br.readLine().split(" ");
			members[i][0] = strArr[0];
			members[i][1] = strArr[1];
		}
		
		Arrays.sort(members,new Comparator<String[]>(){
			
			@Override
			public int compare(String[] c1,String[] c2 ) {
				return Integer.compare(Integer.parseInt(c1[0]),Integer.parseInt(c2[0]));
			}
		});
		
		
		for(int i=0;i<N;i++) {
			
			System.out.println(members[i][0] +" "+ members[i][1]);
			
		}

	}

}
