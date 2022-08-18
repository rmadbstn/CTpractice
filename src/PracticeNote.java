import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PracticeNote {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<6;i++) {
			list.add(i);
		}
		list.remove(2);
		
		for(int a : list) {
			System.out.println(a);
		}
//		System.out.println(list.get(4));

	}

}
