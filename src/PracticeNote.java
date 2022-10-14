import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class PracticeNote {
	
 public static void main(String[] args) throws IOException {

	 
	 	LinkedList<int[]> list = new LinkedList<int[]>();
	 
	 	list.add(new int[] {1,2,3});
	 	
	 	
	 	Queue queue = new LinkedList<int[]>();
	 	
	 	for(int[] a:list) {
	 		
	 		
	 		queue.offer(a);
	 	}
	 	
	 	int[] arr = (int[])queue.poll();
	 
	 	
	 	System.out.println(arr[0]);
	 	

	}

}
