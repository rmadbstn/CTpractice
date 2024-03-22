package Programmerslv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChoiceOrange {

	public static void main(String[] args) {
		int[] tangerine = { 1, 3, 2, 5, 4, 5, 2, 3 };

		int answer = 0;

		Arrays.sort(tangerine); // 1,2,2,3,3,4,5,5

		System.out.println(Arrays.toString(tangerine));

		int check = tangerine[0];
		int count = 1;
		int k = 4; // 귤의 개
		ArrayList<Integer> numArr = new ArrayList<>();

		for (int i = 1; i < tangerine.length; i++) {

			if (tangerine[i] != check) {
//				System.out.println("추가시점:"+i+ "추가숫자:"+count);
				check = tangerine[i];
				numArr.add(count);
				count = 1;
			} else {
				count++;
			}

			if (i == tangerine.length - 1) {
//				System.out.println("추가시점:"+i+"추가숫자:"+count);
				numArr.add(count);
			}

		}
		System.out.println(numArr);

		Collections.sort(numArr);

		for (int i = numArr.size() - 1; i >= 0; i--) {
			answer++;
			k -= numArr.get(i);

			if (k <= 0) {
				break;
			}
		}

		System.out.println("최소귤종류 갯수:" + answer);

	}

}
