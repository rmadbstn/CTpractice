package QueueAndDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon18258 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		
		Queue<Integer> queue = new LinkedList<>();
		
		int back =0;
		
		for(int i=0;i<n;i++) {
			
			String[] strArr = br.readLine().split(" ");
			
			
			
			switch(strArr[0])
			{
			
			
			case "push":
				queue.offer(Integer.parseInt(strArr[1]));
				
				back = Integer.parseInt(strArr[1]); //맨뒤 숫자를 저장.
				break;
				
			case "pop":
				
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					
					bw.write(queue.poll()+"\n");
					
				}
				break;
			case "size":
				
				bw.write(queue.size()+"\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
					bw.write("1"+"\n");
				}else {
					bw.write("0"+"\n");
				}
				break;
			case "front":
				
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(queue.peek()+"\n");
				}
			
				break;
			case "back":
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					
					bw.write(back+"\n");
					
				}
			
				break;
			
			
			
			}
			
			
			
		}
		
		bw.flush();
		bw.close();
	}
	
	

}
