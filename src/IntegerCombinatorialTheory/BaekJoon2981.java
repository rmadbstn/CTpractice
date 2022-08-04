package IntegerCombinatorialTheory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BaekJoon2981 {         // A = X*M + r , B = Y*M + r
									// B-A = (Y-X)M; ->C-B = (Z-Y)M; 즉 B-A와 C-B의 공약수를 찾는 것.->두수의 최대공약수의 약수들을 구하면된다 ->유클리드 호제
									//유클리드 호제법 https://www.youtube.com/watch?v=K-DwxHl1eJY
	static int Euclide(int a, int b) {
		
		
		int r;
		
		
		
		while(b!=0)
		{
			
			r=a%b;
			a=b;
			b=r;
			
		}
		
		return a;//나눠 떨어지는 순간 a의값이 최대 공약수 (유클리드 호제법) 
	}
	

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int maxValues = arr[1]-arr[0]; //최대 공약수를 저장할변수.
		
		for(int i= 2; i<N;i++) {
			
			maxValues = Euclide(maxValues,arr[i]-arr[i-1]);   //계속 나오는 최대 공약수와 비교.
			
		}
		
		
		for (int i= 2; i<=maxValues;i++) {
			
			if(maxValues % i ==0) {
				
				bw.write(i+" ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}
