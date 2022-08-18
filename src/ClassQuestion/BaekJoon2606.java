package ClassQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon2606 {

	static int count = 0;
	static boolean[] check = new boolean[101];
	
	public static void dfs(LinkedList<Integer>[] list, int index) {
//		System.out.println("dfs:"+index);
//		System.out.println(list[index]);
		
		check[index] = true;
		
		if(list[index].size()==0) {
			
			return;
		}
		
		
		
		for (int b : list[index]) {
			
			if(check[b]== true) {
				continue;
			}
			
			count++;
//			System.out.println(b);
			
			list[b].remove(list[b].indexOf(index));
 
			dfs(list, b);

		}


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 컴퓨터의 개수.
		int M = sc.nextInt(); // 컴퓨터 쌍의 개수.

		LinkedList<Integer>[] list = new LinkedList[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = new LinkedList<>();

		}

		for (int i = 0; i < M; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			list[a].add(b);
			list[b].add(a);

		}
//		System.out.println(list[1]);
		
		dfs(list,1);
		System.out.println(count);

	}

}
