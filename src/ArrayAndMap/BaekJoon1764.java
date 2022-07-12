package ArrayAndMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int Index = 0;
		String[] resultArr = new String[50000];
		HashSet<String> set = new HashSet<String>();

		int hashSize = 0;

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i=0;i<a+b;i++) {
			String k = sc.next();
			set.add(k);
			if(hashSize==set.size()) {
				resultArr[count]=k;
				count++;
			}
			hashSize=set.size();
		}
		String[] finalResultArr = new String[count];
		
		for(int i=0;i<count;i++) {
			finalResultArr[i] = resultArr[i];
		}
		Arrays.sort(finalResultArr);
		System.out.println(count);
		for (int i=0;i<count;i++) {
			System.out.println(finalResultArr[i]);
		}
		
	}

}
