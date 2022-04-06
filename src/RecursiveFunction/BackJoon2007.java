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
		
		if((x/n)%3 ==1 && (y/n)%3 ==1) { //ũ�� �����̷� ������ x y ��ǥ�� ���� ���� ���� 1�� �͵� = �߾� ����
			bw.write(" ");
		}else {
			if(n/3==0) {                      //x y��ǥ�� 1~3�������� 9~18�������� 27~81�������� ��͸� ���� ��ĭ�� �ִ� ��.
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
