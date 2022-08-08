import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PracticeNote {

	public static void main(String[] args) throws IOException {

		int[][] arr = { { 3, 5 }, { 1, 2 } ,{1,1}};
		
		
		

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] a1, int[] a2) {
				if (a1[0] == a2[0]) {
					return Integer.compare(a1[1], a2[1]);
				} else {
					return Integer.compare(a1[0], a2[0]);
				}
			}
		});

		System.out.println(arr[0][1]);
	}

}
