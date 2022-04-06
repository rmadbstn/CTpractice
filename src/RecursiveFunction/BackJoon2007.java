package RecursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJoon2007 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int x = 0; x<n; x++) {
			for( int y = 0;y<n;y++) {
				 star(x,y,n);
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	static void star (int x,int y, int n)throws IOException {
		
		if((x/n)%3 ==1 && (y/n)%3 ==1) { //크게 세덩이로 나누어 x y 좌표를 나눈 값의 몫이 1인 것들 = 중앙 비우기
			bw.write(" ");
		}else {
			if(n/3==0) {                      //x y좌표가 1~3사이인지 9~18사이인지 27~81사이인지 재귀를 통해 빈칸을 넣는 법.
				System.out.print("*");
			}else {
				star(x,y,n/3);
			}
		}
		
		
		
		
//		if(n==3) {
//			bw.write("***\n* *\n***");
//		}
//		else{
//			for(int i=0; i<3 ;i++) {
//			squareStars(n/3);
//			}
//			bw.write("\n");
//			squareStars(n/3);
//			for(int i=0; i<n ; i++) {
//				bw.write(" ");
//			}
//			for(int i=0; i<n ; i++) {
//				bw.write("\n");
//			}
//			
//			squareStars(n/3);
//			bw.write("\n");
//			for(int i=0; i<3 ;i++) {
//				squareStars(n/3);
//				}
//		}
	}

}
