package RecursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackJoon11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//	Scanner sc = new Scanner(System.in);         //버퍼 써야 빠르다잉.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	int n = sc.nextInt();
	int n = Integer.parseInt(br.readLine());
	
	bw.write((int)Math.pow(2, n)-1+"\n"); //t(n) = 2t(n-1)+1 = 2^n -1
	hanoiWay(n,1,2,3);
	br.close();
	bw.flush();
	bw.close();

	}
	
	
	static void hanoiWay(int n,int from,int temp, int to) throws IOException{
		if(n==1) {
			bw.write(from+" "+to+"\n");
		}
		else {
			
			
			hanoiWay(n-1,from,to,temp);         //temp ->to  to ->temp    
			bw.write(from+" "+to+"\n");
			hanoiWay(n-1,temp,from,to);			//temp ->from from->temp       
		}
	}

}
