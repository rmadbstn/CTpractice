package ClassQuestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

class Node1991 {

	char val ;
	Node1991 left, right;

	 Node1991(char val) {
		this.val = val;
	
	}

}

public class BaekJoon1991 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void backPriority(Node1991 node) throws IOException {
		
		if (node==null||node.val == '.') {
			return;
		}

		String out =Character.toString(node.val);
		
		backPriority(node.left);

		backPriority(node.right);
		
		
		bw.write(out);
	}

	public static void centerPriority(Node1991 node) throws IOException {

		if (node==null||node.val == '.') {
			return;
		}

		String out =Character.toString(node.val);

		centerPriority(node.left);

		bw.write(out);
		
		centerPriority(node.right);

	}

	public static void frontPriority(Node1991 node) throws IOException {

		if (node==null||node.val == '.') {
			return;
		}
		String out =Character.toString(node.val);	
		
		bw.write(out);

		frontPriority(node.left);

		frontPriority(node.right);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<Node1991> queue = new LinkedList<>();

		Node1991 root = new Node1991('A');

		int N = Integer.parseInt(br.readLine());

		queue.offer(root);

		String[][] arr = new String[N][2];

		for (int i = 0; i < N; i++) {
			String[] strArr = br.readLine().split(" ");

			int a = strArr[0].charAt(0)-65;
			
			arr[a][0] = strArr[1];  //알파벳 순으로 배열에 저장. 
			arr[a][1] = strArr[2];

		}

		
		

		for (int i = 0; i < N; i++) {

			Node1991 node = queue.poll();

			
			for (int j = 0; j <= 1; j++) {

				int index = node.val-65;
				
				
				if (arr[index][j].equals(".")) {
					continue;
				}

				if (j == 0) {
					node.left = new Node1991(arr[index][j].charAt(0));
					queue.offer(node.left);
				} else {
					node.right = new Node1991(arr[index][j].charAt(0));
					queue.offer(node.right);
				}
			}

		}
		
//	System.out.println(root.right.right.right.val);
		
		frontPriority(root);
		bw.write("\n");
		centerPriority(root);
		bw.write("\n");
		backPriority(root);
		
		
		bw.flush();
		bw.close();
		
	}

}
