package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] arr = new String[n];
		String check = "";

		for (int i = 0; i < n; i++) {

			arr[i] = sc.next();

		}

		Arrays.sort(arr, new Comparator<String>() {

			public int compare(String c1, String c2) {

				if (c1.length() == c2.length()) {
					return c1.compareTo(c2);
				} else {
					return c1.length() - c2.length();
				}

			}

		});
		for (int i = 0; i < n; i++) {
			if (check.equals(arr[i])) {
				
				continue;
					
			}
				System.out.println(arr[i]);
			
			
			check = arr[i];
		}
	}

}
